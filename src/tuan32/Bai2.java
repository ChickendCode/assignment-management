package tuan32;

public class Bai2 {
    public static String getKetQua() {
    	String ketQua = "String s = abcd abc abc abc cba \n";
    	ketQua += "String s1 = abc \n";
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
        ketQua += "So lan xuat hien xau con là : " + count;
    	return ketQua;
    }
}
