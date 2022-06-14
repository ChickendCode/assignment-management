package tuan29;
public class Bai5 {
    public static String getKetQua() {
    	String ketQua = "Các số nằm giữa 1000 và 2000 đồng thời chia hết cho 3,5,7 là: \n";

        for (int i = 1000; i <= 2000; i++) {
            // nếu i không chia hết cho 3,5,7 đồng th�?i thì quay lại vòng lặp for
            if (i % 3 != 0 || i % 5 != 0 || i % 7 != 0) {
                continue;
            }

            ketQua += i + "\n";
        }
		return ketQua;
    }
}