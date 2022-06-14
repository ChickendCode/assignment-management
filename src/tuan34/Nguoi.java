package tuan34;

public class Nguoi {
    private String HoTen;
    private int NamSinh;
    private String CMND;
    private Phong Phong;
    private int SoNgayThue;

    public Nguoi(String HoTen, int NamSinh, String CMND, Phong Phong, int SoNgayThue) {
        this.HoTen = HoTen;
        this.NamSinh = NamSinh;
        this.CMND = CMND;
        this.SoNgayThue = SoNgayThue;
        this.Phong = Phong;
    }

    public int getSoNgayThue() {
        return SoNgayThue;
    }

    public void setSoNgayThue(int SoNgayThue) {
        this.SoNgayThue = SoNgayThue;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public Phong getPhong() {
        return Phong;
    }

    public void setPhong(Phong Phong) {
        this.Phong = Phong;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "HoTen='" + HoTen + '\'' +
                ", NamSinh=" + NamSinh +
                ", CMND='" + CMND + '\'' + Phong.toString() +
                '}';
    }
}
