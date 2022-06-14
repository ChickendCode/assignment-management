package tuan33;

public class CanBo
{
    private String sHoTen,sGioiTinh,sDiaChi;
    private int iNamSinh;
    //Toan tu tao lap
    CanBo()
    {}
    CanBo(String shoten,String sgioitinh,String sdiachi,int inamsinh)
    {
        this.sHoTen = shoten;
        this.sGioiTinh = sgioitinh;
        this.sDiaChi = sdiachi;
        this.iNamSinh = inamsinh;
    }
    public void InputData()
    {
        System.out.print("Nhap Ho Ten      :");this.sHoTen=NhapDL.nhapchuoi();
        System.out.print("Nhap Gioi Tinh   :");this.sGioiTinh=NhapDL.nhapchuoi();
        System.out.print("Nhap Dia Chi     :");this.sDiaChi=NhapDL.nhapchuoi();
        System.out.print("Nhap Nam Sinh    :");this.iNamSinh=NhapDL.nhapInt();
    }
    // Hien thi thong tin can bo
    public void OutputData()
    {
        System.out.println("Ho ten      :" +this.sHoTen);
        System.out.println("Gioi Tinh   :" +this.sGioiTinh);
        System.out.println("Dia Chi     :" +this.sDiaChi);
        System.out.println("Nam sinh    :" +this.iNamSinh);
    }
    public boolean TimKiem(String sKeyWord)
    {
        StringBuffer st = new StringBuffer(this.sHoTen);
        if(st.lastIndexOf(sKeyWord)>=0)
            return true;
        else 
            return false;
    }
}
