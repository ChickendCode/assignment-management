package tuan30;

import java.util.Scanner;

public class Bai3 {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.println("Nhập số: ");
                int n = input.nextInt();
                float s = 0;
                float t = 1;
                float q = 0;
                for (int i = 1; i <= n; i++) {
                        t = t * i;
                        q = q + t;
                        s = s + 1 / q;
                }
                System.out.println("Tổng là: " + s);
        }
}
