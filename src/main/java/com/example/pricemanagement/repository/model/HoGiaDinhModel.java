package com.example.pricemanagement.repository.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "HOGIADINH")

public class HoGiaDinhModel implements Serializable {
    @Id
    @Column(name = "id_so_ho_khau")
    private String idSoHoKhau;
    private String password;
    private String tenChuHo;
    private String diaChi;

    @OneToMany(mappedBy = "hoGiaDinh")
    private Set<ThanhVienModel> thanhVienModels;

    public HoGiaDinhModel() {
    }

    public HoGiaDinhModel(String idSoHoKhau, String password, String tenChuHo, String diaChi) {
        this.idSoHoKhau = idSoHoKhau;
        this.password = password;
        this.tenChuHo = tenChuHo;
        this.diaChi = diaChi;
    }

    public HoGiaDinhModel(String password, String tenChuHo, String diaChi) {
        this.password = password;
        this.tenChuHo = tenChuHo;
        this.diaChi = diaChi;
    }

    public String getIdSoHoKhau() {
        return idSoHoKhau;
    }

    public void setIdSoHoKhau(String idSoHoKhau) {
        this.idSoHoKhau = idSoHoKhau;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTenChuHo() {
        return tenChuHo;
    }

    public void setTenChuHo(String tenChuHo) {
        this.tenChuHo = tenChuHo;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
