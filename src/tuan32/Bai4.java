package tuan32;

import java.util.Scanner;

// DOANLONGVU 20198195
// Cho trước 1 xâu ký tự là họ tên người đầy đủ, hãy tách ra phần họ của người này
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Nhập họ và tên : ");
        String hoten = sc.nextLine();
        hoten.trim();

        // xử lý tách họ
        String ho = hoten.substring(0, hoten.indexOf(" "));
        System.out.printf(" họ là : " + ho);
    }
}