package com.example.pricemanagement.repository.model;

import javax.persistence.*;

@Entity
@Table(name = "HOGIADINH")
public class HoGiaDinhModel {
    @Id
    private String idSoHoKhau;
    private String password;
    private String tenChuHo;

    public HoGiaDinhModel() {
    }

    public HoGiaDinhModel(String idSoHoKhau, String password, String tenChuHo) {
        this.idSoHoKhau = idSoHoKhau;
        this.password = password;
        this.tenChuHo = tenChuHo;
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
}
