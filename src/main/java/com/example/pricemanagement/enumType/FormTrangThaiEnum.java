package com.example.pricemanagement.enumType;

public enum FormTrangThaiEnum {
    TUCHOI("Từ chối"),
    DANGCHO("Đang chờ"),
    XACNHAN("Xác nhận");

    private String trangThai;

    FormTrangThaiEnum(String trangThai){
        this.trangThai = trangThai;
    }

    public String trangThai(){
        return trangThai;
    }
}
