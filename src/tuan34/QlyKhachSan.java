package tuan34;

import java.util.Objects;
import java.util.Scanner;

public class QlyKhachSan {
	private static KhachSan khachsan = null;
	
	public static void createMemory() {
		khachsan = new KhachSan();
	}
	
	public void clearMemory() {
		if (!Objects.isNull(khachsan)) {
			khachsan = null;
		}
	}
	
	public static void addKhachThue(String loaiPhong, String HoTen, int NamSinh, String CMND, int SoNgayThue) {
		Phong Phong = null;
        if (loaiPhong.equalsIgnoreCase("a")) {
            Phong = new PhongA();
        } else if (loaiPhong.equalsIgnoreCase("b")) {
            Phong = new PhongB();
        } else if (loaiPhong.equalsIgnoreCase("c")) {
            Phong = new PhongC();
        }
        
        Nguoi nguoi = new Nguoi(HoTen, NamSinh, CMND, Phong, SoNgayThue);
        khachsan.add(nguoi);
	}
	
	public static void delete(String cmnd) {
		if (!Objects.isNull(khachsan)) {
			khachsan.delete(cmnd);			
		}
	}
	
	public static String calculator(String cmnd) {
		if (!Objects.isNull(khachsan)) {
			return "Tien thue phong la: " + khachsan.calculator(cmnd);	
		}
		
		return "Khong tim thay khach hang";
	}
	
	public static String showAll() {
		if (!Objects.isNull(khachsan)) {
			return khachsan.show();
		}
		
		return "Khong tim thay khach hang";
	}
}