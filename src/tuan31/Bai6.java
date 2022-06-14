package tuan31;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap n = ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Nhap vao cac phan tu cua mang:");
        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Uoc thuc su cua 1 so hang khac trong day tren la : ");

        for (i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                try {
                    if (arr[i] % arr[j] == 0 && arr[j] > 1 && arr[j] < arr[i]) {
                        System.out.print(arr[j] + " ");
                        arr[j] = 0;
                    }
                } catch (ArithmeticException e) {
                }

            }
        }

    }

}
