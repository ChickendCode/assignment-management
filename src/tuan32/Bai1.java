package tuan32;

import java.util.Scanner;
// DOANLONGVU 20198195
public class Bai1 {
    public static void main(String[] args) {

        //sử dụng class Scanner để lấy dữ liệu từ bàn phím.
        Scanner sc = new Scanner(System.in);
        System.out.print(" Nhập chuỗi :");
        String input = sc.nextLine();
        //hiển thị chuỗi ban đầu
        System.out.println("Chuỗi ban đầu: " + input);

        //sử dụng phương thức replaceAll() để thay thế " " bằng "".
        input = input.replaceAll("\\s", "");
        System.out.println("Chuỗi sau khi xóa dấu cách là : " + input);


    }
}
