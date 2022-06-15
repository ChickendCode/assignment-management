package tuan30;

public class Bai2 {

	public static double giaithua(int n) {
		double tmp = 1;
		if (n > 1) {
			for (int i = 2; i <= n; i++) {
				tmp *= i;
			}
		}
		return tmp;

	}

	public static String getKetQua(int n) {
		float tong = 0.0f;
		for (int i = 1; i <= n; i++) {
			tong += 1 / giaithua(i);
		}

		return "tong day so la: " + tong;
	}
}
