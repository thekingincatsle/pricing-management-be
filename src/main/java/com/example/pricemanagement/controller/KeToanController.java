package com.example.pricemanagement.controller;

import com.example.pricemanagement.repository.model.KeToanModel;
import com.example.pricemanagement.service.KeToanService;
import com.example.pricemanagement.type.accountantconfirmationmessage.AccountantConfirmationMessage;
import com.example.pricemanagement.type.accountmessage.AccountMessageAccountant;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/accountant")
public class KeToanController {
    private final KeToanService keToanService;

    public KeToanController(KeToanService keToanService) {
        this.keToanService = keToanService;
    }

    //Validate accountant's login information
    @PostMapping("/login")
    public AccountMessageAccountant login(@RequestBody KeToanModel keToanModel){
        return this.keToanService.login(keToanModel);
    }

    @PostMapping("/confirm-student-form")
    public String confirmStudentForm(@RequestBody AccountantConfirmationMessage accountantConfirmationMessage){
        return this.keToanService.confirmStudentForm(accountantConfirmationMessage);
    }
}
