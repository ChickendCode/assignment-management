package tuan31;

public class Bai2 {
	public static String getKetQua(int[] arr, int n) {
		String ketQua = "Cac so nguyen to cua day la : \n";
		for (int i = 0; i < n; i++) {
			if (check(arr[i])) ketQua += arr[i] + " ";
		}
		return ketQua;
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
