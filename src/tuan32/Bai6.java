package tuan32;

// DOANLONGVU 20198195
// Cho trước xâu ký tự S, in ra xâu S1 ngược lại xâu S.
public class Bai6 {
	public static String getKetQua(String S) {
//		System.out.print(" Nhap xau : ");
		StringBuffer S1 = new StringBuffer(S);
		return " KET QUA : " + S1.reverse().toString(); // sử dụng phương thức reverse() để đảo ngược chuỗi
														// hiện tại
	}
}
