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

    @ManyToOne()
    @JoinColumn(name = "idDanhHieu")
    private DanhHieuModel danhHieu = new DanhHieuModel();
    private String trangThai;
    @ManyToOne()
    @JoinColumn(name = "maGiayKhaiSinh", nullable = false)
    private HocSinhModel hocSinh;
    @ManyToOne()
    @JoinColumn(name = "email")
    private CanBoModel canBo = new CanBoModel();
    @OneToOne(mappedBy = "formDangKy", fetch = FetchType.LAZY)
    private XacNhanPhanThuongHocSinhModel xacNhanPhanThuongHocSinh;
    @OneToOne(mappedBy = "formDangKy", fetch = FetchType.LAZY)
    private FormXacNhanHocSinhModel formXacNhanHocSinh;


    public FormDangKyModel() {
    }

    public FormDangKyModel(String anhMinhChung, String giaiThuong, String trangThai, HocSinhModel hocSinh) {
        this.anhMinhChung = anhMinhChung;
        this.giaiThuong = giaiThuong;
        this.trangThai = trangThai;
        this.hocSinh = hocSinh;
    }

    public FormDangKyModel(String anhMinhChung, String giaiThuong, DanhHieuModel danhHieu, String trangThai, HocSinhModel hocSinh) {
        this.anhMinhChung = anhMinhChung;
        this.giaiThuong = giaiThuong;
        this.danhHieu = danhHieu;
        this.trangThai = trangThai;
        this.hocSinh = hocSinh;
    }

    public FormDangKyModel(String anhMinhChung, String giaiThuong, DanhHieuModel danhHieu, String trangThai, HocSinhModel hocSinh, CanBoModel canBo) {
        this.anhMinhChung = anhMinhChung;
        this.giaiThuong = giaiThuong;
        this.danhHieu = danhHieu;
        this.trangThai = trangThai;
        this.hocSinh = hocSinh;
        this.canBo = canBo;
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

    public DanhHieuModel getDanhHieu() {
        if(danhHieu!=null){
            return danhHieu;
        }
        else{
            return null;
        }
    }

    public void setDanhHieu(DanhHieuModel danhHieu) {
        this.danhHieu = danhHieu;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public HocSinhModel getHocSinh() {
        return hocSinh;
    }

    public void setHocSinh(HocSinhModel hocSinh) {
        this.hocSinh = hocSinh;
    }

    public CanBoModel getCanBo() {
        return canBo;
    }

    public void setCanBo(CanBoModel canBo) {
        this.canBo = canBo;
    }

}
