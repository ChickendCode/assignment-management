package tuan29;

public class Bai1 {
    public static String getKetQua(int n) {
    	String ketQua = "Tất cả các số nguyên tố nhỏ hơn " + n + " là: \n";
    	
    	if (n >= 2) {
    		ketQua += 2 + " ";
        }
        for (int i = 1; i < n; i += 1) {
            if (isPrimeNumber(i)) {
            	ketQua += i + " ";
            }
        }
        
		return ketQua;
    }

    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }
}