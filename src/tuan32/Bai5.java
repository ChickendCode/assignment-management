package tuan32;

import java.util.Scanner;

// DOANLONGVU 20198195
//Bài 05: Cho một xâu ký tự bao gồm toàn các ký tự 0,1. Hãy biến đổi xâu này theo cách 0🡪1, 1🡪0 và in ra kết quả.
public class Bai5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Nhap mot xau ky tu chua 0 va 1 : ");
        String s = input.nextLine();

        System.out.println(" Xau bien doi " + s.replace("0", "1") + " và " + s.replace("1", "0"));
    }
}
