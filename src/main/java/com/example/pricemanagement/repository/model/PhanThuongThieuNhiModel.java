package com.example.pricemanagement.repository.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "PHANTHUONGTHIEUNHI")
public class PhanThuongThieuNhiModel {
    @Id
    @SequenceGenerator(
            name = "phanthuongthieunhi_sequence",
            sequenceName = "phanthuongthieunhi_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "phanthuongthieunhi_sequence"
    )
    private Long idPhanThuongThieuNhi;
    private String tenPhanThuong;
    private int soLuong;
    private int nam;

    @OneToMany(mappedBy = "phanThuongThieuNhi")
    private Set<TraoThuongThieuNhiModel> traoThuongThieuNhis;

    public PhanThuongThieuNhiModel() {
    }

    public PhanThuongThieuNhiModel(Long idPhanThuongThieuNhi, String tenPhanThuong, int soLuong, int nam) {
        this.idPhanThuongThieuNhi = idPhanThuongThieuNhi;
        this.tenPhanThuong = tenPhanThuong;
        this.soLuong = soLuong;
        this.nam = nam;
    }

    public PhanThuongThieuNhiModel(String tenPhanThuong, int soLuong, int nam) {
        this.tenPhanThuong = tenPhanThuong;
        this.soLuong = soLuong;
        this.nam = nam;
    }

    public Long getIdPhanThuongThieuNhi() {
        return idPhanThuongThieuNhi;
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

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
}
