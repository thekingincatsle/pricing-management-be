package com.example.pricemanagement.type.acountmessage;

import com.example.pricemanagement.repository.model.CanBoModel;

public class AccountMessageStaff extends AccountMessage {
    private CanBoModel canBoModel;

    public AccountMessageStaff(boolean validated, String message) {
        super(validated, message);
    }

    public AccountMessageStaff(boolean validated, String message, CanBoModel canBoModel) {
        super(validated, message);
        this.canBoModel = canBoModel;
    }

    public CanBoModel getCanBoModel() {
        return canBoModel;
    }

    public void setCanBoModel(CanBoModel canBoModel) {
        this.canBoModel = canBoModel;
    }
}
