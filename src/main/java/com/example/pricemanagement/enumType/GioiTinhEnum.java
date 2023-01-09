package com.example.pricemanagement.enumType;

public enum GioiTinhEnum {
    Nam("Nam"),
    Nu("Nữ"),
    Khac("Khac");

    private String gioiTinh;

    GioiTinhEnum(String gioiTinh){
        this.gioiTinh = gioiTinh;
    }

    public String gioiTinh(){
        return gioiTinh;
    }
}
