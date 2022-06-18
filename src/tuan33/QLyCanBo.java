package tuan33;

import java.util.*;

public class QLyCanBo {
	private static CanBo[] dsCB = null;

	public static void nhapCanBo(int i, int soLuongCanBo, String sLoaiCB, String hoTen, String gioiTinh, String diaChi,
			int namSinh) {
		dsCB = new CanBo[soLuongCanBo];
		if (sLoaiCB.equalsIgnoreCase("cn")) {
			dsCB[i] = new CongNhan(hoTen, gioiTinh, diaChi, namSinh);
		} else if (sLoaiCB.equalsIgnoreCase("ks")) {
			dsCB[i] = new KySu(hoTen, gioiTinh, diaChi, namSinh);
		} else if (sLoaiCB.equalsIgnoreCase("nv")) {
			dsCB[i] = new NhanVien(hoTen, gioiTinh, diaChi, namSinh);
		}
	}

	public static void main(String[] args) {
		CanBo[] dsCB = null;
		int iLuaChon = -1, n = 0;
		while (iLuaChon != 5) {
			System.out.println("||===============================||");
			System.out.println("||     Chuong Trinh QLy Can Bo   ||");
			System.out.println("|| 1. Nhap Thong Tin moi n CBo   ||");
			System.out.println("|| 2. Tim kiem theo ho ten       ||");
			System.out.println("|| 3. Hien thi thong tin ve dsCB ||");
			System.out.println("|| 4. Thoat khoi chuong trinh    ||");
			System.out.println("||===============================||");
			System.out.print("Nhap lua chon cua ban: ");
			iLuaChon = NhapDL.nhapInt();
			switch (iLuaChon) {
			case 1: {
				System.out.print("Ban muon nhap bao nhieu can bo? ");
				n = NhapDL.nhapInt();
				dsCB = new CanBo[n];
				for (int i = 0; i < n; i++) {
					System.out.println("Nhap vao thong tin cho can bo thu " + (i + 1));
					boolean ok = false;
					while (!ok) {
						System.out.print("Nhap loai can bo CN,KS,NV: ");
						String sLoaiCB = NhapDL.nhapchuoi().trim();
						if (sLoaiCB.equalsIgnoreCase("cn")) {
							dsCB[i] = new CongNhan();
							dsCB[i].InputData();
							ok = true;
						} else if (sLoaiCB.equalsIgnoreCase("ks")) {
							dsCB[i] = new KySu();
							dsCB[i].InputData();
							ok = true;
						} else if (sLoaiCB.equalsIgnoreCase("nv")) {
							dsCB[i] = new NhanVien();
							dsCB[i].InputData();
							ok = true;
						}
					}
				}
				System.out.println("Da nhap xong . . . .");
				break;
			}
			case 2: {
				if (dsCB != null) {
					System.out.print("Nhap tu khoa: ");
					String sKey = NhapDL.nhapchuoi().trim();
					StringTokenizer st2 = new StringTokenizer(sKey, " ", false);
					System.out.println("Ket qua tim kiem: ");
					for (int i = 0; i < n; i++)
						if (dsCB[i].TimKiem(st2.nextToken()) || (st2.hasMoreTokens())) {
							dsCB[i].OutputData();
						}
					System.out.println("Tim xong!!");
				} else
					System.out.println("Canh bao: Ban chua nhap danh sach!!");
				break;
			}
			case 3: {
				if (dsCB != null) {
					System.out.println("Danh sach can bo la:");
					for (int i = 0; i < n; i++) {
						dsCB[i].OutputData();
					}
				} else {
					System.out.println("Ban chua nhap ds can bo!!!");
				}
				break;
			}
			case 4: {
				System.out.println("GoodBye. See You Again!!!");
				break;
			}
			}
		}
	}
}
