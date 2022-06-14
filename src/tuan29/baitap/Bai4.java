package tuan29.baitap;

public class Bai4 {
    public static void main(String[] args) {
        System.out.println("Các số chia hết cho 3 hoặc 7 là: ");

        for (int i = 0; i <= 100; i++) {
            // nếu i không chia hết cho 3 hoặc 5 thì quay lại vòng lặp for
            if (i % 3 != 0 && i % 7 != 0) {
                continue;
            }

            System.out.println(i);
        }
    }
}