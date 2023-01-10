package com.example.pricemanagement.repository.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "DANHHIEU")
public class DanhHieuModel {
    @Id
    @SequenceGenerator(
            name = "danhhieu_sequence",
            sequenceName = "danhhieu_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "danhhieu_sequence"
    )
    @Column(name = "idDanhHieu")
    private Long id;
    private String tenDanhHieu;
    @JsonIgnore
    @OneToMany(mappedBy = "danhHieu")
    private Set<FormDangKyModel> formDangKys;

    @OneToOne
    @JoinColumn(name = "idPhanThuongHocSinh")
    private PhanThuongHocSinhGioiModel phanThuongHocSinhGioi;

    public DanhHieuModel() {
    }

    public DanhHieuModel(String tenDanhHieu, Set<FormDangKyModel> formDangKys, PhanThuongHocSinhGioiModel phanThuongHocSinhGioi) {
        this.tenDanhHieu = tenDanhHieu;
        this.formDangKys = formDangKys;
        this.phanThuongHocSinhGioi = phanThuongHocSinhGioi;
    }

    public Long getId() {
        return id;
    }

    public String getTenDanhHieu() {
        return tenDanhHieu;
    }

    public void setTenDanhHieu(String tenDanhHieu) {
        this.tenDanhHieu = tenDanhHieu;
    }

    public Set<FormDangKyModel> getFormDangKys() {
        return formDangKys;
    }

    public void setFormDangKys(Set<FormDangKyModel> formDangKys) {
        this.formDangKys = formDangKys;
    }

    public PhanThuongHocSinhGioiModel getPhanThuongHocSinhGioi() {
        return phanThuongHocSinhGioi;
    }

    public void setPhanThuongHocSinhGioi(PhanThuongHocSinhGioiModel phanThuongHocSinhGioi) {
        this.phanThuongHocSinhGioi = phanThuongHocSinhGioi;
    }
}
