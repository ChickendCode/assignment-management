package tuan32;

import java.util.ArrayList;
import java.util.List;

// DOANLONGVU 20198195
// Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn có phần đệm là “Thị”.
public class Bai8 {
    public static void main(String[] args) {
        ArrayList<String> DS = new ArrayList<>(); // khai báo một danh sách mảng trống có tên là DS
        // su dung phuong thuc add() them các phần tử vào DS
        DS.add(" Nguyễn Mạnh Dũng ");
        DS.add(" Nguyễn Đức Anh");
        DS.add(" Đoàn Long Vũ");
        DS.add(" Nguyễn Thị Hạnh ");

        System.out.println(" Số học sinh tên đệm Thị là :" + count(DS));
    }

    // phương thức tachten
    public static String[] tachten(String hoten) {
        String[] s = hoten.split(" ");// phương thưc split() tách chuỗi họ tên hoc sinh thành các xâu con bởi khoảng
                                      // trắng
        return s;
    }

    public static int count(List<String> DS) {
        int count = 0;
        String[][] array = new String[DS.size()][];// khai báo mảng 2 chiều vs
        // // vòng lặp for duyet cac phan tu co trong danh sach mang
        for (int i = 0; i < DS.size(); i++) {
            array[i] = tachten(DS.get(i));
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].equals("Thị"))
                    count++;

            }

        }
        return count;

    }

}
