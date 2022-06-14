package tuan29;

public class Bai2 {
    public static String getKetQua() {
        int status = 1;
        int num = 3;
        String ketQua = "20 số nguyên tố đầu tiên là: \n";
        ketQua += 2 + "\n";
        for (int i = 2; i <= 20;) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                ketQua += num + "\n";
                i++;
            }
            status = 1;
            num++;
        }
        
		return ketQua;
    }
}