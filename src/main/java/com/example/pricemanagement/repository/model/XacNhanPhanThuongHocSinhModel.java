package com.example.pricemanagement.repository.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "XACNHANPHANTHUONGHOCSINH")
public class XacNhanPhanThuongHocSinhModel {
    @Id
    private Long id;
    @OneToOne()
    @PrimaryKeyJoinColumn(name="id", referencedColumnName="id")
    private FormDangKyModel formDangKy;
    @ManyToOne()
    @JoinColumn(name = "idPhanThuongHocSinh")
    private PhanThuongHocSinhGioiModel phanThuongHocSinhGioi;
    @ManyToOne()
    @JoinColumn(name = "email")
    private KeToanModel keToan;
    private String trangThai;

    public XacNhanPhanThuongHocSinhModel() {
    }

    public XacNhanPhanThuongHocSinhModel(FormDangKyModel formDangKy, PhanThuongHocSinhGioiModel phanThuongHocSinhGioi, KeToanModel keToan, String trangThai) {
        this.formDangKy = formDangKy;
        this.phanThuongHocSinhGioi = phanThuongHocSinhGioi;
        this.keToan = keToan;
        this.trangThai = trangThai;
    }

    public Long getId() {
        return id;
    }

    public FormDangKyModel getFormDangKy() {
        return formDangKy;
    }

    public void setFormDangKy(FormDangKyModel formDangKy) {
        this.formDangKy = formDangKy;
    }

    public PhanThuongHocSinhGioiModel getPhanThuongHocSinhGioi() {
        return phanThuongHocSinhGioi;
    }

    public void setPhanThuongHocSinhGioi(PhanThuongHocSinhGioiModel phanThuongHocSinhGioi) {
        this.phanThuongHocSinhGioi = phanThuongHocSinhGioi;
    }

    public KeToanModel getKeToan() {
        return keToan;
    }

    public void setKeToan(KeToanModel keToan) {
        this.keToan = keToan;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}
