package tuan32;


// DOANLONGVU 20198195
// Cho trước 1 xâu ký tự là họ tên người đầy đủ, hãy tách ra phần tên của người này
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Nhập họ và tên : ");
        String hoten = sc.nextLine();
        hoten.trim(); // phương thức trim() loại bỏ khoảng trắng ở đầu và cuối chuỗi

        // xu ly tách tên
        String ten = hoten.substring(hoten.lastIndexOf(" ")); // phương thức substring() để trích xuất một chuỗi con từ
                                                              // một chuỗi
        System.out.print(" TEN LÀ " + ten);

    }
}
