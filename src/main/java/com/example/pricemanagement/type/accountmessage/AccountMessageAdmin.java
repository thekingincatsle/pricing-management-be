package com.example.pricemanagement.type.accountmessage;

import com.example.pricemanagement.repository.model.CanBoModel;

public class AccountMessageAdmin extends AccountMessage {
    private CanBoModel canBo;

    public AccountMessageAdmin(boolean validated, String message) {
        super(validated, message);
    }

    public AccountMessageAdmin(boolean validated, String message, CanBoModel canBo) {
        super(validated, message);
        this.canBo = canBo;
    }

    public CanBoModel getCanBo() {
        return canBo;
    }

    public void setCanBo(CanBoModel canBo) {
        this.canBo = canBo;
    }
}
