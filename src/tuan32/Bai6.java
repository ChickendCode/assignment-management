package tuan32;

import java.util.Scanner;
import java.util.function.DoubleFunction;

// DOANLONGVU 20198195
// Cho trước xâu ký tự S, in ra xâu S1 ngược lại xâu S.
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Nhap xau : ");
        String S = sc.nextLine();

        StringBuffer S1 = new StringBuffer(S);
        System.out.println(" KET QUA : " + S1.reverse().toString()); // sử dụng phương thức reverse() để đảo ngược chuỗi
                                                                     // hiện tại

    }
}
