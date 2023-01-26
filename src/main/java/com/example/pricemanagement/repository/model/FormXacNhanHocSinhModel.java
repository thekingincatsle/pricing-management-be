package com.example.pricemanagement.repository.model;

import javax.persistence.*;

@Entity
@Table(name = "FORMXACNHANHOCSINH")
public class FormXacNhanHocSinhModel {
    @Id
    private Long id;
    @OneToOne()
    @PrimaryKeyJoinColumn(name="id", referencedColumnName="id")
    private FormDangKyModel formDangKy;
    private String trangThai;
    @ManyToOne()
    @JoinColumn(name = "nam")
    private LeTraoThuongModel leTraoThuong;

    public FormXacNhanHocSinhModel() {
    }

    public FormXacNhanHocSinhModel(Long id, FormDangKyModel formDangKy, String trangThai, LeTraoThuongModel leTraoThuong) {
        this.id = id;
        this.formDangKy = formDangKy;
        this.trangThai = trangThai;
        this.leTraoThuong = leTraoThuong;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FormDangKyModel getFormDangKy() {
        return formDangKy;
    }

    public void setFormDangKy(FormDangKyModel formDangKy) {
        this.formDangKy = formDangKy;
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
