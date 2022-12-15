package com.example.pricemanagement.repository.model;

import javax.persistence.*;

@Entity
@Table(name = "THANHVIEN")
public class ThanhVienModel {
    @Id
    @SequenceGenerator(
            name = "thanhvien_sequence",
            sequenceName = "thanhvien_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "thanhvien_sequence"
    )

    private Long id;
    private String maGiayKhaiSinh;
    private String ten;
    private int namSinh;
    private String idSoHokhau;

    public ThanhVienModel() {
    }

    public ThanhVienModel(String maGiayKhaiSinh, String ten, int namSinh, String idSoHokhau) {
        this.maGiayKhaiSinh = maGiayKhaiSinh;
        this.ten = ten;
        this.namSinh = namSinh;
        this.idSoHokhau = idSoHokhau;
    }

    public Long getId() {
        return id;
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

    public String getIdSoHokhau() {
        return idSoHokhau;
    }

    public void setIdSoHokhau(String idSoHokhau) {
        this.idSoHokhau = idSoHokhau;
    }
}
