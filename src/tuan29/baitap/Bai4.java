package tuan29.baitap;

public class Bai4 {
    public static String getKetQua() {
    	String ketQua = "Các số chia hết cho 3 hoặc 7 là: \n";

        for (int i = 0; i <= 100; i++) {
            // nếu i không chia hết cho 3 hoặc 5 thì quay lại vòng lặp for
            if (i % 3 != 0 && i % 7 != 0) {
                continue;
            }
            
            ketQua += i + " ";
        }
        
		return ketQua;
    }
}