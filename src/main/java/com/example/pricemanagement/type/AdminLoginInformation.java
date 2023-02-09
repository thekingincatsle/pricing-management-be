package com.example.pricemanagement.type;

public class AdminLoginInformation {
    private String email;
    private String password;
    private boolean isCanBo;

    public AdminLoginInformation(String email, String password, boolean isCanBo) {
        this.email = email;
        this.password = password;
        this.isCanBo = isCanBo;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean isCanBo() {
        return isCanBo;
    }
}
