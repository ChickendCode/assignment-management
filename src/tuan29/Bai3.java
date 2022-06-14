package tuan29;

public class Bai3 {
    public static String getKetQua() {
    	int i = 0;
        int num = 0;
        // Empty String
        String primeNumbers = "";
        for (i = 1000; i <= 2000; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                // Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        
        String ketQua = "Các số nguyên tố từ 1000 đến 2000 là: \n";
        ketQua += primeNumbers;
        
		return ketQua;
    }
}