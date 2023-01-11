package com.example.pricemanagement.type.acountmessage;

import com.example.pricemanagement.repository.model.HoGiaDinhModel;

public class AccountMessageFamily extends AccountMessage {
    private HoGiaDinhModel hoGiaDinhModel;

    public AccountMessageFamily(boolean validated, String message) {
        super(validated, message);
    }

    public AccountMessageFamily(boolean validated, String message, HoGiaDinhModel hoGiaDinhModel) {
        super(validated, message);
        this.hoGiaDinhModel = hoGiaDinhModel;
    }

    public HoGiaDinhModel getHoGiaDinhModel() {
        return hoGiaDinhModel;
    }

    public void setHoGiaDinhModel(HoGiaDinhModel hoGiaDinhModel) {
        this.hoGiaDinhModel = hoGiaDinhModel;
    }
}
