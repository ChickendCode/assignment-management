package tuan29;
public class Bai6 {
    public static String getKetQua() {
    	String ketQua = "";
    	int k = 0, j = 0, n, tong;
        while (j < 5) {
            k++;
            tong = 1;
            for (n = 2; n < k; n++) {
                if (k % n == 0)
                    tong += n;
            }
            if (k == tong) {
            	ketQua += k + " ";
                j++;
            }
        }
		return ketQua;
    }
}
