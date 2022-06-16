package tuan31;

public class Bai1 {
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