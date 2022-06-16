package tuan32;

// DOANLONGVU 20198195
// Cho trước 1 xâu ký tự là họ tên người đầy đủ, hãy tách ra phần họ của người này
public class Bai4 {
    public static String getKetQua(String hoten) {
//        System.out.print(" Nhập họ và tên : ");
        hoten.trim();

        // xử lý tách họ
        String ho = hoten.substring(0, hoten.indexOf(" "));
        return "họ là : " + ho;
	}
}