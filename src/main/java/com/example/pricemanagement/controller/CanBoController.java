package com.example.pricemanagement.controller;

import com.example.pricemanagement.repository.model.CanBoModel;
import com.example.pricemanagement.service.CanBoService;
import com.example.pricemanagement.type.accountmessage.AccountMessageAdmin;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class CanBoController {
    private final CanBoService canBoService;

    public CanBoController(CanBoService canBoService) {
        this.canBoService = canBoService;
    }

    //Validate admin's login information
    @PostMapping("/login")
    public AccountMessageAdmin login(@RequestBody CanBoModel canBoModel){
        return this.canBoService.login(canBoModel);
    }
}
