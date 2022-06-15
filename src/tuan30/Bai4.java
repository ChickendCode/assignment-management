package tuan30;

public class Bai4 {
	public static String getKetQua(int n) {
		int a = 0, b = 1;
		int sum = 0;
		for (int i = 1; i <= n - 2; i++) {
			sum = a + b;
			a = b;
			b = sum;
		}
		
		return "Số Fibonacci thứ " + n + " là: " + sum;
	}
}
