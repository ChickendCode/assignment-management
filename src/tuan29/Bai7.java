package tuan29;

public class Bai7 {

    static int countDivisibles(int A, int B, int X) {
        int counter = 0;

        for (int i = A; i <= B; i++)
            if (i % 5 == 0)
                counter++;

        return counter;

    }

    static int countDivisibles1(int C, int D, int X) {
        int counter = 0;

        for (int i = C; i <= D; i++)
            if (i % 5 == 1)
                counter++;

        return counter;

    }

    static int countDivisibles2(int E, int F, int X) {
        int counter = 0;

        for (int i = E; i <= F; i++)
            if (i % 5 == 2)
                counter++;

        return counter;

    }

    static int countDivisibles3(int G, int H, int X) {
        int counter = 0;

        for (int i = G; i <= H; i++)
            if (i % 5 == 3)
                counter++;

        return counter;

    }
    
    public static String getKetQua() {
    	int A = 0, B = 100, X = 5, C = 0, D = 100, E = 0, F = 100, G = 0, H = 100;
    	
    	String ketQua = " Tổng số nhỏ hơn hoặc bằng và chia hết cho 5 là: \n";
    	ketQua += countDivisibles(A, B, X) + "\n";
        
    	ketQua += " Tổng số nhỏ hơn hoặc bằng và chia 5 dư 1 là: \n";
    	ketQua += countDivisibles1(C, D, X) + "\n";
    	
    	ketQua += " Tổng số nhỏ hơn hoặc bằng và chia 5 dư 2 là: \n";
    	ketQua += countDivisibles2(E, F, X) + "\n";
        
    	ketQua += " Tổng số nhỏ hơn hoặc bằng 100 và chia 5 dư 3 là: \n";
    	ketQua += countDivisibles3(G, H, X);
    	
		return ketQua;
    }
}