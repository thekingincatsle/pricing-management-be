package com.example.pricemanagement.repository.model;

import javax.persistence.*;

@Entity
@Table(name = "FORMXACNHANTHIEUNHI")
public class FormXacNhanThieuNhiModel {
    @Id
    private Long id;
    @ManyToOne
    @JoinColumn(name = "maGiayKhaiSinh")
    private ThanhVienModel thanhVien;
    private String trangThai;
    @ManyToOne()
    @JoinColumn(name = "nam")
    private LeTraoThuongModel leTraoThuong;

    public FormXacNhanThieuNhiModel() {
    }

    public FormXacNhanThieuNhiModel(Long id, ThanhVienModel thanhVien, String trangThai, LeTraoThuongModel leTraoThuong) {
        this.id = id;
        this.thanhVien = thanhVien;
        this.trangThai = trangThai;
        this.leTraoThuong = leTraoThuong;
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

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public LeTraoThuongModel getLeTraoThuong() {
        return leTraoThuong;
    }

    public void setLeTraoThuong(LeTraoThuongModel leTraoThuong) {
        this.leTraoThuong = leTraoThuong;
    }
}
