package tuan31;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 34, 56, 98, 3, 2, 2 };
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        System.out.println(" GIA TRI LON NHAT LA : " + max);

    }

}
