package com.example.pricemanagement.controller;

import com.example.pricemanagement.repository.model.CanBoModel;
import com.example.pricemanagement.service.CanBoService;
import com.example.pricemanagement.type.acountmessage.AccountMessageStaff;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class CanBoController {
    private final CanBoService canBoService;

    public CanBoController(CanBoService canBoService) {
        this.canBoService = canBoService;
    }

    @PostMapping("/login")
    public AccountMessageStaff login(@RequestBody CanBoModel canBoModel){
        return this.canBoService.login(canBoModel);
    }
}
