package tuan34;

public class PhongA extends Phong {

    public PhongA() {
        super("A", 500);
    }

    @Override
    public String toString() {
        return "PhongA{" +
                "LoaiPhong='" + LoaiPhong + '\'' +
                ", GiaPhong=" + GiaPhong +
                '}';
    }
}