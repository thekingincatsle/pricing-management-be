package com.example.pricemanagement.repository.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "THANHVIEN")
public class ThanhVienModel{
    @Id
    @Column(name = "ma_giay_khai_sinh")
    private String maGiayKhaiSinh;
    private String ten;
    private String gioiTinh;
    private int namSinh;

    @ManyToOne()
    @JoinColumn(name = "id_so_ho_khau", nullable = false)
    private HoGiaDinhModel hoGiaDinh;

    @OneToOne(mappedBy = "thanhVien", fetch = FetchType.LAZY)
    private HocSinhModel hocSinh;

    public ThanhVienModel() {
    }

    public ThanhVienModel(String maGiayKhaiSinh, String ten, String gioiTinh, int namSinh, HoGiaDinhModel hoGiaDinh, HocSinhModel hocSinh) {
        this.maGiayKhaiSinh = maGiayKhaiSinh;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.hoGiaDinh = hoGiaDinh;
        this.hocSinh = hocSinh;
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

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
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
