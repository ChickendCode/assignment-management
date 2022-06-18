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
    public String OutputData()
    {
    	String ketQua = "Ho ten      :" + this.sHoTen + "\n";
    	 ketQua += "Gioi Tinh   :" +this.sGioiTinh + "\n";
    	 ketQua += "Dia Chi     :" +this.sDiaChi + "\n";
    	 ketQua += "Nam sinh    :" +this.iNamSinh + "\n";
    	 
    	 return ketQua;
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
