package com.example.pricemanagement.type.accountantconfirmationmessage;

import com.example.pricemanagement.repository.model.KeToanModel;

public class AccountantConfirmationMessage {
    private boolean confirm;
    private int year;
    private KeToanModel keToan;

    public AccountantConfirmationMessage(boolean confirm, int year, KeToanModel keToan) {
        this.confirm = confirm;
        this.year = year;
        this.keToan = keToan;
    }

    public boolean isConfirm() {
        return confirm;
    }

    public void setConfirm(boolean confirm) {
        this.confirm = confirm;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public KeToanModel getKeToan() {
        return keToan;
    }

    public void setKeToan(KeToanModel keToan) {
        this.keToan = keToan;
    }
}
