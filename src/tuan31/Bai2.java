package tuan31;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Nhap so phan tu cua mang n = ");
        int n = sc.nextInt();

        // khoi tao mang
        int[] arr = new int[n];
        nhap(arr, n);
        xuat(arr, n);
        // in so nguyen to ra man hinh
        System.out.print(" Cac so nguyen to cua day la : ");
        for (int i = 0; i < n; i++) {
            if (check(arr[i]))
                System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void nhap(int arr[], int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap mang : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void xuat(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static boolean check(int n) {
        if (n <= 1)
            return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 1)
                return true;
            return false;
        }
        return true;
    }

}
