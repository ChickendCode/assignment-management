package tuan32;

// DOANLONGVU 20198195
public class Bai1 {
    public static String getKetQua(String input) {
    	String ketQua = "Chuỗi ban đầu: " + input + "\n";
    	input = input.replaceAll("\\s", "");
    	
    	ketQua += "Chuỗi sau khi xóa dấu cách là : " + input;
    	return ketQua;
    }
}
