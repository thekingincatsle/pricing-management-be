package com.example.pricemanagement.repository.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "THANHVIEN")
@Embeddable
public class ThanhVienModel implements Serializable {
    @Id
    private String maGiayKhaiSinh;
    private String ten;
    private int namSinh;
    @ManyToOne
    @JoinColumn(name = "idSoHoKhau", nullable = false)
    private HoGiaDinhModel hoGiaDinh;
    @OneToOne(mappedBy = "thanhVien", cascade = CascadeType.ALL)
    private HocSinhModel hocSinh;

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
