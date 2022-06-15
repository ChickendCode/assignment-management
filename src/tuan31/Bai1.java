package tuan31;

import java.util.Scanner;

public class Bai1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        // sắp xếp dãy số theo thứ tự giảm dần
        sortDESC(arr);
        System.out.println("Dãy số được sắp xếp giảm dần: ");
        show(arr);
    }
    
    public static String getKetQua(int[] arr) {
    	// sắp xếp dãy số theo thứ tự giảm dần
        sortDESC(arr);
        String ketQua = "Dãy số được sắp xếp giảm dần: \n";
        for (int i = 0; i < arr.length; i++) {
            ketQua += arr[i] + " ";
        }
		return ketQua;
	}

    public static void sortDESC(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}