package tuan30;

import java.util.Scanner;

public class Bai1 {

    public static int n;

    public static double cong(int n) {
        double tmp = 1;
        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                tmp += i;
            }
        }
        return tmp;

    }

    public static void main(String[] args) {
        float tong = 0.0f;
        Scanner reader = new Scanner(System.in);
        System.out.print("Nhập số tự nhiên N = ");
        n = reader.nextInt();
        for (int i = 1; i <= n; i++) {
            tong += 1 / cong(i);
        }
        System.out.println("tong day so la: " + tong);
    }
}
