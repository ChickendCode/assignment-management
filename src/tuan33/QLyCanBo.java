package tuan33;

import java.util.*;

public class QLyCanBo {
	private static CanBo[] dsCB = null;

	public static void createMemory(int soLuongCanBo) {
		dsCB = new CanBo[soLuongCanBo];
	}

	public static void nhapCanBo(int i, String sLoaiCB, String hoTen, String gioiTinh, String diaChi, int namSinh) {
		if (sLoaiCB.equalsIgnoreCase("cn")) {
			dsCB[i] = new CongNhan(hoTen, gioiTinh, diaChi, namSinh);
		} else if (sLoaiCB.equalsIgnoreCase("ks")) {
			dsCB[i] = new KySu(hoTen, gioiTinh, diaChi, namSinh);
		} else if (sLoaiCB.equalsIgnoreCase("nv")) {
			dsCB[i] = new NhanVien(hoTen, gioiTinh, diaChi, namSinh);
		}
	}

	public static boolean checkHasData() {
		if (dsCB == null || dsCB.length == 0) {
			return false;
		}

		return true;
	}

	public static String timKiem(String tuKhoa) {
		String sKey = tuKhoa.trim();
		StringTokenizer st2 = new StringTokenizer(sKey, " ", false);
		String ketQua = "Ket qua tim kiem: \n";
		try {
			for (int i = 0; i < dsCB.length; i++)
				if (dsCB[i].TimKiem(st2.nextToken()) || (st2.hasMoreTokens())) {
					ketQua += dsCB[i].OutputData();
				}
		} catch (Exception e) {
		}

		ketQua += "Tim xong!!";
		return ketQua;
	}
	
	public static String xuatDanhSach() {
		String ketQua = "Danh sach can bo la: \n";
        for (int i = 0; i < dsCB.length; i++) {
        	ketQua += dsCB[i].OutputData();
        }
        
        return ketQua;
	}
}
