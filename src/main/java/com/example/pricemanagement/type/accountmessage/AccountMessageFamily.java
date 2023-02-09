package com.example.pricemanagement.type.accountmessage;

import com.example.pricemanagement.repository.model.HoGiaDinhModel;

public class AccountMessageFamily extends AccountMessage {
    private HoGiaDinhModel hoGiaDinh;

    public AccountMessageFamily(boolean validated, String message) {
        super(validated, message);
    }

    public AccountMessageFamily(boolean validated, String message, HoGiaDinhModel hoGiaDinh) {
        super(validated, message);
        this.hoGiaDinh = hoGiaDinh;
    }

    public HoGiaDinhModel getHoGiaDinh() {
        return hoGiaDinh;
    }

    public void setHoGiaDinh(HoGiaDinhModel hoGiaDinh) {
        this.hoGiaDinh = hoGiaDinh;
    }
}
