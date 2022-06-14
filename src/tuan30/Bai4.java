package tuan30;

import java.util.Scanner;

public class Bai4 {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.println("Nhập số thứ: ");
                int n = input.nextInt();
                int a = 0, b = 1;
                int sum = 0;
                for (int i = 1; i <= n - 2; i++) {
                        sum = a + b;
                        a = b;
                        b = sum;
                }
                System.out.println("Số Fibonacci thứ " + n + " là: " + sum);
        }
}
