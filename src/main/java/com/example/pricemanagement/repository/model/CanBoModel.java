package com.example.pricemanagement.repository.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "CANBO")

public class CanBoModel {
    @Id
    private String email;
    private String tenCanBo;
    private String password;
    @OneToMany(mappedBy = "canBo")
    private Set<FormDangKyModel> formDangKyModels;

    public CanBoModel() {
    }

    public CanBoModel(String email, String tenCanBo, String password) {
        this.email = email;
        this.tenCanBo = tenCanBo;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTenCanBo() {
        return tenCanBo;
    }

    public void setTenCanBo(String ten) {
        this.tenCanBo = tenCanBo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
