package tuan33;

import java.io.*;

public class NhapDL {
    static DataInputStream str = new DataInputStream(System.in);

    public static String nhapchuoi() {
        String st = "";
        try {
            st = str.readLine();
        } catch (Exception e) {
            System.out.println("Loi" + e);
        }
        return st;
    }

    public static int nhapInt() {
        String st = NhapDL.nhapchuoi();
        int i = 0;
        try {
            i = Integer.valueOf(st).intValue();
        } catch (Exception e) {
            System.out.println("Loi" + e);
        }
        return i;
    }
}
