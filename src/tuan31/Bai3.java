package tuan31;

public class Bai3 {
    public static String getKetQua() {
    	int arr[] = new int[] { 1213, 31234, 51236, 94358, 3675, 2786, 2123 };
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        String ketQua = "{ 1213, 31234, 51236, 94358, 3675, 2786, 2123 } \n";
        ketQua += "GIA TRI NHO NHAT LA : " + min;
        
        return ketQua;
	}
}
