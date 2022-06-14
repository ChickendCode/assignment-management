package tuan30;

import java.util.Scanner;

public class Bai4 {
    public static double giaithua;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Nhập số tự nhiên N = ");
        int x = reader.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
