package com.example.pricemanagement.repository.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "HOCSINH")
public class HocSinhModel{

    @Id
    private String maGiayKhaiSinh;

    @OneToOne()
    @PrimaryKeyJoinColumn(name="ma_giay_khai_sinh", referencedColumnName="ma_giay_khai_sinh")
    private ThanhVienModel thanhVien;
    private String truong;
    private String lop;
    @JsonIgnore
    @OneToMany(mappedBy = "hocSinh")
    private Set<FormDangKyModel> formDangKyModels;


    public HocSinhModel() {
    }

    public HocSinhModel( ThanhVienModel thanhVien, String truong, String lop) {
        this.thanhVien = thanhVien;
        this.truong = truong;
        this.lop = lop;
    }

    public HocSinhModel(String maGiayKhaiSinh, String truong, String lop) {
        this.maGiayKhaiSinh = maGiayKhaiSinh;
        this.truong = truong;
        this.lop = lop;
    }


    public ThanhVienModel getThanhVien() {
        return thanhVien;
    }

    public void setThanhVien(ThanhVienModel thanhVien) {
        this.thanhVien = thanhVien;
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

    public Set<FormDangKyModel> getFormDangKyModels() {
        return formDangKyModels;
    }

    public void setFormDangKyModels(Set<FormDangKyModel> formDangKyModels) {
        this.formDangKyModels = formDangKyModels;
    }
}
