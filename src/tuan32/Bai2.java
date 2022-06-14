package tuan32;

// DOANLONGVU 20198195
// Bài 02: Cho trước xâu ký tự bất kỳ. Hãy đếm xem trong xâu có bao nhiêu lần xuất hiện xâu con “abc”

import java.util.Arrays;

public class Bai2 {
    public static void main(String[] args) {

        String s = "abcd abc abc abc cba";
        String s1 = "abc";
        int count = 0;
        s.trim();
        String[] a = s.split(" "); // tạo mảng chuỗi chứa các xâu con đã đc tách từ xâu ký tự cho trước
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("abc")) // phương thức equals() so sanh xau thứ i đã đc tách bởi phương thức split() vs
                                    // xâu con "abc"
                count++;
        }
        System.out.println(" So lan xuat hien xau con là : " + count);
    }
}
