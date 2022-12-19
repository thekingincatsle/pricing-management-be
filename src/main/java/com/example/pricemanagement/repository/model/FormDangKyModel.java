package com.example.pricemanagement.repository.model;

import javax.persistence.*;

@Entity
@Table(name = "FORMDANGKY")
public class FormDangKyModel {
    @Id
    @SequenceGenerator(
            name = "formdangky_sequence",
            sequenceName = "formdangky_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "formdangky_sequence"
    )

    private Long id;
    private String anhMinhChung;
    private String giaiThuong;

    private String danhHieu;
    private String trangThai;
    private String maGiayKhaiSinh;
    private String email;

    public FormDangKyModel() {
    }

    public FormDangKyModel(String anhMinhChung, String giaiThuong, String trangThai, String maGiayKhaiSinh, String email) {
        this.anhMinhChung = anhMinhChung;
        this.giaiThuong = giaiThuong;
        this.trangThai = trangThai;
        this.maGiayKhaiSinh = maGiayKhaiSinh;
        this.email = email;
    }

    public FormDangKyModel(String anhMinhChung, String giaiThuong, String trangThai, String maGiayKhaiSinh) {
        this.anhMinhChung = anhMinhChung;
        this.giaiThuong = giaiThuong;
        this.trangThai = trangThai;
        this.maGiayKhaiSinh = maGiayKhaiSinh;
    }

    public FormDangKyModel(String anhMinhChung, String giaiThuong, String danhHieu, String trangThai, String maGiayKhaiSinh, String email) {
        this.anhMinhChung = anhMinhChung;
        this.giaiThuong = giaiThuong;
        this.danhHieu = danhHieu;
        this.trangThai = trangThai;
        this.maGiayKhaiSinh = maGiayKhaiSinh;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getAnhMinhChung() {
        return anhMinhChung;
    }

    public void setAnhMinhChung(String anhMinhChung) {
        this.anhMinhChung = anhMinhChung;
    }

    public String getGiaiThuong() {
        return giaiThuong;
    }

    public void setGiaiThuong(String giaiThuong) {
        this.giaiThuong = giaiThuong;
    }

    public String getDanhHieu() {
        return danhHieu;
    }

    public void setDanhHieu(String danhHieu) {
        this.danhHieu = danhHieu;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getMaGiayKhaiSinh() {
        return maGiayKhaiSinh;
    }

    public void setMaGiayKhaiSinh(String maGiayKhaiSinh) {
        this.maGiayKhaiSinh = maGiayKhaiSinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
