package tuan29.baitap;
public class Bai5 {
    public static void main(String[] args) {
        System.out.println("Các số nằm giữa 1000 và 2000 đồng th�?i chia hết cho 3,5,7 là: ");

        for (int i = 1000; i <= 2000; i++) {
            // nếu i không chia hết cho 3,5,7 đồng th�?i thì quay lại vòng lặp for
            if (i % 3 != 0 || i % 5 != 0 || i % 7 != 0) {
                continue;
            }

            System.out.println(i);
        }
    }
}