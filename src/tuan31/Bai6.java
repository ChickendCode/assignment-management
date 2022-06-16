package tuan31;

public class Bai6 {
    public static String getKetQua(int[] arr, int n) {
    	int i;
    	String ketQua = "Uoc thuc su cua 1 so hang khac trong day tren la :  \n";

        for (i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                try {
                    if (arr[i] % arr[j] == 0 && arr[j] > 1 && arr[j] < arr[i]) {
                        ketQua += arr[j] + " ";
                        arr[j] = 0;
                    }
                } catch (ArithmeticException e) {
                }

            }
        }
		return ketQua;
	}

}
