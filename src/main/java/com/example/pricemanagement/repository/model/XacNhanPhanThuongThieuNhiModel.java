package com.example.pricemanagement.repository.model;

import javax.persistence.*;

@Entity
@Table(name = "XACNHANPHANTHUONGTHIEUNHI")
public class XacNhanPhanThuongThieuNhiModel {
    @Id
    private int nam;
    private int giaTri;
    private String trangThai;
    @ManyToOne()
    @JoinColumn(name = "email")
    private KeToanModel keToan;

    public XacNhanPhanThuongThieuNhiModel() {
    }

    public XacNhanPhanThuongThieuNhiModel(int nam, int giaTri, String trangThai, KeToanModel keToan) {
        this.nam = nam;
        this.giaTri = giaTri;
        this.trangThai = trangThai;
        this.keToan = keToan;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public int getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(int giaTri) {
        this.giaTri = giaTri;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public KeToanModel getKeToan() {
        return keToan;
    }

    public void setKeToan(KeToanModel keToan) {
        this.keToan = keToan;
    }
}
