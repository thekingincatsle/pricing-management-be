package com.example.pricemanagement.repository.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "KETOAN")

public class KeToanModel {
    @Id
    private String email;
    private String tenKeToan;
    private String password;
    @OneToMany(mappedBy = "keToan")
    private Set<XacNhanPhanThuongHocSinhModel> xacNhanPhanThuongHocSinhs;

    public KeToanModel() {
    }

    public KeToanModel(String email, String tenKeToan, String password) {
        this.email = email;
        this.tenKeToan = tenKeToan;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTenKeToan() {
        return tenKeToan;
    }

    public void setTenKeToan(String tenKeToan) {
        this.tenKeToan = tenKeToan;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
