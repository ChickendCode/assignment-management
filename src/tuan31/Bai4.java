package tuan31;

public class Bai4 {
    public static String getKetQua() {
    	int arr[] = new int[] { 1, 34, 56, 98, 3, 2, 2 };
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        
        String ketQua = "{ 1, 34, 56, 98, 3, 2, 2 } \n";
        ketQua += "GIA TRI LON NHAT LA : " + max;
        return ketQua;
	}
}
