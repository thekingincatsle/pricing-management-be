package com.example.pricemanagement.enumType;

public enum DanhHieuEnum {
    GIOI("Giỏi"),
    TIENTIEN("Tiên tiến"),
    CONLAI("Còn lại");

    private String danhHieu;

    DanhHieuEnum(String danhHieu){
        this.danhHieu = danhHieu;
    }

    public String danhHieu(){
        return danhHieu;
    }
}
