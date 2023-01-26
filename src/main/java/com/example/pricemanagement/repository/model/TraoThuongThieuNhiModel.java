package com.example.pricemanagement.repository.model;

import javax.persistence.*;

@Entity
@Table(name = "TRAOTHUONGTHIEUNHI")
public class TraoThuongThieuNhiModel {
    @Id
    private Long id;
    @ManyToOne
    @JoinColumn(name = "maGiayKhaiSinh")
    private ThanhVienModel thanhVien;
    @ManyToOne
    @JoinColumn(name = "idPhanThuongThieuNhi")
    private PhanThuongThieuNhiModel phanThuongThieuNhi;

    public TraoThuongThieuNhiModel(ThanhVienModel thanhVien, PhanThuongThieuNhiModel phanThuongThieuNhi) {
        this.thanhVien = thanhVien;
        this.phanThuongThieuNhi = phanThuongThieuNhi;
    }

    public TraoThuongThieuNhiModel(Long id, ThanhVienModel thanhVien, PhanThuongThieuNhiModel phanThuongThieuNhi) {
        this.id = id;
        this.thanhVien = thanhVien;
        this.phanThuongThieuNhi = phanThuongThieuNhi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ThanhVienModel getThanhVien() {
        return thanhVien;
    }

    public void setThanhVien(ThanhVienModel thanhVien) {
        this.thanhVien = thanhVien;
    }

    public PhanThuongThieuNhiModel getPhanThuongThieuNhi() {
        return phanThuongThieuNhi;
    }

    public void setPhanThuongThieuNhi(PhanThuongThieuNhiModel phanThuongThieuNhi) {
        this.phanThuongThieuNhi = phanThuongThieuNhi;
    }
}
