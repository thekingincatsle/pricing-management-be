package com.example.pricemanagement.repository.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "LETRAOTHUONG")
public class LeTraoThuongModel {
    @Id
    private int nam;
    private String diaDiem;
    private String thoiGian;
    @OneToMany(mappedBy = "leTraoThuong")
    private Set<FormXacNhanHocSinhModel> formXacNhanHocSinhs;
    @OneToMany(mappedBy = "leTraoThuong")
    private Set<FormXacNhanThieuNhiModel> formXacNhanThieuNhis;

    public LeTraoThuongModel(int nam, String diaDiem, String thoiGian) {
        this.nam = nam;
        this.diaDiem = diaDiem;
        this.thoiGian = thoiGian;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }
}
