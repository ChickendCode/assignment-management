package tuan34;

import java.util.Scanner;

public class QlyKhachSan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KhachSan khachsan = new KhachSan();
        while (true) {

            System.out.println(" 1: Them khach thue");
            System.out.println(" 2: Xoa khach thue bang CMND");
            System.out.println(" 3: Tinh tien thue phong bang CMND");
            System.out.println(" 4: Hien thi thong tin khach thue");
            System.out.println(" 5: Thoat chuong trinh:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.print("Nhap ho va ten khach hang: ");
                    String HoTen = scanner.nextLine();
                    System.out.print("Nhap nam sinh khach hang: ");
                    int NamSinh = scanner.nextInt();
                    System.out.print("Nhap CMND: ");
                    scanner.nextLine();
                    String CMND = scanner.nextLine();
                    System.out.println("Nhap a de thue phong loai A");
                    System.out.println("Nhap b de thue phong loai B");
                    System.out.println("nhap c de thue phong loai C");
                    String NhapLoaiPhong = scanner.nextLine();
                    Phong Phong;
                    if (NhapLoaiPhong.equals("a")) {
                        Phong = new PhongA();
                    } else if (NhapLoaiPhong.equals("b")) {
                        Phong = new PhongB();
                    } else if (NhapLoaiPhong.equals("c")) {
                        Phong = new PhongC();
                    } else {
                        continue;
                    }
                    System.out.print("Nhap so ngay thue phong: ");
                    int SoNgayThue = scanner.nextInt();
                    Nguoi nguoi = new Nguoi(HoTen, NamSinh, CMND, Phong, SoNgayThue);
                    khachsan.add(nguoi);
                    scanner.nextLine();
                    break;
                }
                case "2": {
                    System.out.print("Nhap CMND: ");
                    String CMND = scanner.nextLine();
                    khachsan.delete(CMND);
                    break;
                }
                case "3": {
                    System.out.print("Nhap CMND: ");
                    String CMND = scanner.nextLine();
                    System.out.println("Tien thue phong la: " + khachsan.calculator(CMND));
                    break;
                }
                case "4": {
                    khachsan.show();
                    break;
                }
                case "5": {
                    return;
                }
                default:
                    System.out.println("Loi");
                    continue;
            }
        }

    }
}