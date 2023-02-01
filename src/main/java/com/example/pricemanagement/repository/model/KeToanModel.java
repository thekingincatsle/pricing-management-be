package com.example.pricemanagement.repository.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "KETOAN")

public class KeToanModel {
    @Id
    private String email;
    private String ten;
    private String password;
    @OneToMany(mappedBy = "keToan")
    private Set<XacNhanPhanThuongHocSinhModel> xacNhanPhanThuongHocSinhs;
    @OneToMany(mappedBy = "keToan")
    private Set<XacNhanPhanThuongThieuNhiModel> xacNhanPhanThuongThieuNhis;

    public KeToanModel() {
    }

    public KeToanModel(String email, String ten, String password) {
        this.email = email;
        this.ten = ten;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
