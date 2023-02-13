package com.example.pricemanagement.type;

import com.example.pricemanagement.repository.model.HocSinhModel;
import com.example.pricemanagement.repository.model.ThanhVienModel;

public class AddMember {
    private ThanhVienModel thanhVien;
    private HocSinhModel hocSinh;

    public AddMember(ThanhVienModel thanhVien, HocSinhModel hocSinh) {
        this.thanhVien = thanhVien;
        this.hocSinh = hocSinh;
    }

    public ThanhVienModel getThanhVien() {
        return thanhVien;
    }

    public void setThanhVien(ThanhVienModel thanhVien) {
        this.thanhVien = thanhVien;
    }

    public HocSinhModel getHocSinh() {
        return hocSinh;
    }

    public void setHocSinh(HocSinhModel hocSinh) {
        this.hocSinh = hocSinh;
    }
}
