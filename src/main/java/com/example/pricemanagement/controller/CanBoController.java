package com.example.pricemanagement.controller;

import com.example.pricemanagement.service.CanBoService;
import com.example.pricemanagement.service.KeToanService;
import com.example.pricemanagement.type.AdminLoginInformation;
import com.example.pricemanagement.type.accountmessage.AccountMessage;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class CanBoController {
    private final CanBoService canBoService;
    private final KeToanService keToanService;

    public CanBoController(CanBoService canBoService, KeToanService keToanService) {
        this.canBoService = canBoService;
        this.keToanService = keToanService;
    }

    //Validate admin's login information
    @PostMapping("/login")
    public AccountMessage login(@RequestBody AdminLoginInformation adminLoginInformation){
        if(adminLoginInformation.isCanBo()){
            return this.canBoService.login(adminLoginInformation);
        }
        else{
            return this.keToanService.login((adminLoginInformation));
        }
    }
}
