package tuan34;

import java.util.ArrayList;
import java.util.List;

public class KhachSan {
    private List<Nguoi> nguoi;

    public KhachSan() {
        nguoi = new ArrayList<>();
    }

    public void add(Nguoi nguoi) {
        this.nguoi.add(nguoi);
    }

    public boolean delete(String CMND) {
        Nguoi nguoi = this.nguoi.stream().filter(p -> p.getCMND().equals(CMND)).findFirst().orElse(null);
        if (nguoi == null) {
            return false;
        } else {
            this.nguoi.remove(nguoi);
            return true;
        }
    }

    public int calculator(String CMND) {
        Nguoi nguoi = this.nguoi.stream().filter(p -> p.getCMND().equals(CMND)).findFirst().orElse(null);
        if (nguoi == null) {
            return 0;
        }
        return nguoi.getPhong().getGiaPhong() * nguoi.getSoNgayThue();
    }

    public String show() {
    	String ketQua = "";
        for (Nguoi item : this.nguoi) {
        	ketQua += item.toString() + "\n";
		}
        
        return ketQua;
    }
}
