package tuan32;

import java.util.ArrayList;
import java.util.List;

// DOANLONGVU 20198195
//Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn có tên bắt đầu bằng chữ “H”.
public class Bai9 {
    public static String tachten(String hoten) {
        String[] ten = hoten.split(" "); // sử dụng phương thức split() để tách chuỗi hoten dựa trên khoảng trắng " "
        return ten[ten.length - 1];
    }

    public static int count(List<String> DS) {
        int count = 0;
        String[] arr = new String[DS.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = tachten(DS.get(i));
            if (arr[i].charAt(0) == 'H') // phương thức charAt() trả về giá trị Char của chuỗi tại vị trí có chỉ số
                                         // index đc xác định bắt đầu bằng 0
                count++;
        }
        return count;
    }
    
    public static String getKetQua() {
    	ArrayList<String> DS = new ArrayList<>();// khai bao mot danh sach mang trong co ten la DS
        // su dung phuong thuc add() de them cac phan tu vao mang
        DS.add(" Nguyễn Đức Anh ");
        DS.add(" Đoàn Long Vũ ");
        DS.add(" Nguyễn Mạnh Dũng ");
        DS.add(" Trần Quang Hải ");
        
        String ketQua = String.join("\n", DS);
        ketQua += "\n Số học sinh có tên bắt đầu bằng chữ cái H là :" + count(DS);
		return ketQua;
	}
}
