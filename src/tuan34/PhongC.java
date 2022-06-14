package tuan34;

public class PhongC extends Phong {
    public PhongC() {
        super("C", 100);
    }

    @Override
    public String toString() {
        return "PhongC{" +
                "LoaiPhong='" + LoaiPhong + '\'' +
                ", GiaPhong=" + GiaPhong +
                '}';
    }
}