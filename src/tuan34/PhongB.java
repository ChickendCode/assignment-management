package tuan34;

public class PhongB extends Phong {
    public PhongB() {
        super("B", 300);
    }

    @Override
    public String toString() {
        return "PhongB{" +
                "LoaiPhong='" + LoaiPhong + '\'' +
                ", GiaPhong=" + GiaPhong +
                '}';
    }
}