package tuan30;

public class Bai3 {
	public static String getKetQua(int n) {
		float s = 0;
		float t = 1;
		float q = 0;
		for (int i = 1; i <= n; i++) {
			t = t * i;
			q = q + t;
			s = s + 1 / q;
		}
		
		return "Tổng là: " + s;
    }
}
