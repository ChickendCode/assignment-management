package tuan32;

import java.util.ArrayList;

// DOANLONGVU 20198195
//Bài 7: Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn tên “An”
public class Bai7 {
    public static void main(String[] args) {

        ArrayList<String> DS = new ArrayList<>(); // khai báo một danh sach mảng trong co ten la DS
        // su dung phuong thuc add() them các phan tu vao mảng
        DS.add("Nguyễn Minh An ");
        DS.add("Lê Văn An");
        DS.add("Nguyễn Đức Anh");

        System.out.println(" Số học sinh tên An là :" + count(DS));
    }

    public static String tachten(String hoten) {
        String[] S = hoten.split(" ");// tạo mảng chuỗi lưu các xâu con đã được tách bởi phương thức split()
        return S[S.length - 1];
    }

    public static int count(ArrayList<String> DS) {
        int count = 0;
        String[] array = new String[DS.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = tachten(DS.get(i));
            if (array[i].equals("An"))
                count++;

        }
        return count;

    }
}
