package com.example.pricemanagement.repository.model;

import javax.persistence.*;

@Entity
@Table(name = "CANBO")
public class CanBoModel {
    @Id
    @SequenceGenerator(
            name = "canbo_sequence",
            sequenceName = "canbo_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "canbo_sequence"
    )

    private Long id;
    private String email;
    private String ten;
    private String password;

    public CanBoModel() {
    }

    public CanBoModel(String email, String ten, String password) {
        this.email = email;
        this.ten = ten;
        this.password = password;
    }

    public Long getId() {
        return id;
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
