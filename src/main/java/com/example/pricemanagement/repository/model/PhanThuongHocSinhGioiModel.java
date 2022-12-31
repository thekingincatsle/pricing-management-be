package com.example.pricemanagement.repository.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "PHANTHUONGHOCSINHGIOI")
public class PhanThuongHocSinhGioiModel {
    @Id
    @SequenceGenerator(
            name = "phanthuonghocsinh_sequence",
            sequenceName = "phanthuonghocsinh_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "phanthuonghocsinh_sequence"
    )
    private Long idPhanThuongHocSinh;
    private String tenPhanThuong;
    private int soLuong;
    private long tien;
    @OneToOne(mappedBy = "phanThuongHocSinhGioi")
    private DanhHieuModel danhHieu;
    @OneToMany(mappedBy = "phanThuongHocSinhGioi")
    private Set<XacNhanPhanThuongHocSinhModel> xacNhanPhanThuongHocSinhs;

    public PhanThuongHocSinhGioiModel(String tenPhanThuong, int soLuong, long tien, DanhHieuModel danhHieu) {
        this.tenPhanThuong = tenPhanThuong;
        this.soLuong = soLuong;
        this.tien = tien;
        this.danhHieu = danhHieu;
    }

    public Long getIdPhanThuongHocSinh() {
        return idPhanThuongHocSinh;
    }

    public String getTenPhanThuong() {
        return tenPhanThuong;
    }

    public void setTenPhanThuong(String tenPhanThuong) {
        this.tenPhanThuong = tenPhanThuong;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public long getTien() {
        return tien;
    }

    public void setTien(long tien) {
        this.tien = tien;
    }

    public DanhHieuModel getDanhHieu() {
        return danhHieu;
    }

    public void setDanhHieu(DanhHieuModel danhHieu) {
        this.danhHieu = danhHieu;
    }
}
