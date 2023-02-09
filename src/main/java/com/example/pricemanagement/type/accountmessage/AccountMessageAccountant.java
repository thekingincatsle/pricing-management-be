package com.example.pricemanagement.type.accountmessage;

import com.example.pricemanagement.repository.model.KeToanModel;

public class AccountMessageAccountant extends AccountMessage{
    private KeToanModel keToan;

    public AccountMessageAccountant(boolean validated, String message, KeToanModel keToan) {
        super(validated, message);
        this.keToan = keToan;
    }

    public AccountMessageAccountant(boolean validated, String message) {
        super(validated, message);
    }

    public KeToanModel getKeToan() {
        return keToan;
    }

    public void setKeToan(KeToanModel keToan) {
        this.keToan = keToan;
    }
}
