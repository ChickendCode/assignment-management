package tuan32;

public class Bai3 {
	public static String getKetQua(String hoten) {
//    	System.out.print(" Nhập họ và tên : ");
		hoten.trim(); // phương thức trim() loại bỏ khoảng trắng ở đầu và cuối chuỗi
		// xu ly tách tên
		String ten = hoten.substring(hoten.lastIndexOf(" ")); // phương thức substring() để trích xuất một chuỗi con từ
																// một chuỗi
		return "TEN LÀ " + ten;
	}
}
