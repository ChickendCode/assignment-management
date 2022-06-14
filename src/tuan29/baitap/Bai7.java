package tuan29.baitap;
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

    public static void main(String[] args) {

        int A = 0, B = 100, X = 5, C = 0, D = 100, E = 0, F = 100, G = 0, H = 100;
        System.out.println(" Tổng số nh�? hơn hoặc bằng và chia hết cho 5 là:");
        System.out.println(countDivisibles(A, B, X));
        System.out.println(" Tổng số nh�? hơn hoặc bằng và chia 5 dư 1 là:");
        System.out.println(countDivisibles1(C, D, X));
        System.out.println(" Tổng số nh�? hơn hoặc bằng và chia 5 dư 2 là:");
        System.out.println(countDivisibles2(E, F, X));
        System.out.println(" Tổng số nh�? hơn hoặc bằng 100 và chia 5 dư 3 là:");
        System.out.println(countDivisibles3(G, H, X));

    }
}