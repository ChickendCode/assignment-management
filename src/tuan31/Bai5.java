package tuan31;

public class Bai5 {
    public static String getKetQua(int[] arr, int n) {
    	int i;
    	int b = 0;
        int c = 0;
        for (i = 0; i < n; i++) {
            if (check(arr[i])) {
                b++;

            } else {
                if (arr[i] > 3) {
                    c++;
                }
            }

        }
        
        String ketQua = "Co " + b + " so nguyen to \n";
        ketQua += "Co " + c + " hop so";
		return ketQua;
	}

    public static boolean check(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        // Nếu không chia hết thì trả về true
        return true;
    }
}
