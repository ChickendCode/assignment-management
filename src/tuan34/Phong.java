package tuan34;

public class Phong {
    protected String LoaiPhong;
    protected int GiaPhong;

    public Phong(String LoaiPhong, int GiaPhong) {
        this.LoaiPhong = LoaiPhong;
        this.GiaPhong = GiaPhong;
    }

    public String getLoaiPhong() {
        return LoaiPhong;
    }

    public void setLoaiPhong(String LoaiPhong) {
        this.LoaiPhong = LoaiPhong;
    }

    public int getGiaPhong() {
        return GiaPhong;
    }

    public void setGiaPhong(int GiaPhong) {
        this.GiaPhong = GiaPhong;
    }
}