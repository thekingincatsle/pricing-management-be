package com.example.pricemanagement.repository.model;

import javax.persistence.*;

@Entity
@Table(name = "HOCSINH")
public class HocSinhModel {
    @Id
    private String maGiayKhaiSinh;
    private String truong;
    private String lop;

    public HocSinhModel() {
    }

    public HocSinhModel(String maGiayKhaiSinh, String truong, String lop) {
        this.maGiayKhaiSinh = maGiayKhaiSinh;
        this.truong = truong;
        this.lop = lop;
    }

    public String getMaGiayKhaiSinh() {
        return maGiayKhaiSinh;
    }

    public void setMaGiayKhaiSinh(String maGiayKhaiSinh) {
        this.maGiayKhaiSinh = maGiayKhaiSinh;
    }

    public String getTruong() {
        return truong;
    }

    public void setTruong(String truong) {
        this.truong = truong;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
}
