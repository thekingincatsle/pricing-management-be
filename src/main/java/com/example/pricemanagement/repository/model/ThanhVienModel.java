package com.example.pricemanagement.repository.model;

import javax.persistence.*;

@Entity
@Table(name = "THANHVIEN")
public class ThanhVienModel {
    @Id
    private String maGiayKhaiSinh;
    private String ten;
    private int namSinh;
    @ManyToOne
    @JoinColumn(name = "hogiadinh_idSoHoKhau")
    private HoGiaDinhModel hoGiaDinh;

    public ThanhVienModel() {
    }

    public ThanhVienModel(String maGiayKhaiSinh, String ten, int namSinh, HoGiaDinhModel hoGiaDinh) {
        this.maGiayKhaiSinh = maGiayKhaiSinh;
        this.ten = ten;
        this.namSinh = namSinh;
        this.hoGiaDinh = hoGiaDinh;
    }

    public String getMaGiayKhaiSinh() {
        return maGiayKhaiSinh;
    }

    public void setMaGiayKhaiSinh(String maGiayKhaiSinh) {
        this.maGiayKhaiSinh = maGiayKhaiSinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public HoGiaDinhModel getHoGiaDinh() {
        return hoGiaDinh;
    }

    public void setHoGiaDinh(HoGiaDinhModel hoGiaDinh) {
        this.hoGiaDinh = hoGiaDinh;
    }
}
