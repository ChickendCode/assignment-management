package tuan30;

import java.util.Scanner;

public class Bai3 {

    public static double giaithua(int n) {
        double tmp = 1;
        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                tmp *= i;
            }
        }
        return tmp;

    }

    public static int soThuN(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += giaithua(i);
        }
        
        return count;
    }

    public static double tong(int n) {
        double count = 0;
        for (int i = 1; i <= n; i++) {
            count += soThuN(i);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập N: ");
        int n = in.nextInt();
        System.out.println(" Tổng dãy số trên là " + tong(n));
    }
}
