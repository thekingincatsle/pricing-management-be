package com.example.pricemanagement.controller;

import com.example.pricemanagement.repository.model.HoGiaDinhModel;
import com.example.pricemanagement.service.HoGiaDinhService;
import com.example.pricemanagement.type.acountmessage.AccountMessage;
import com.example.pricemanagement.type.acountmessage.AccountMessageFamily;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/family")
public class HoGiaDinhController {
    private final HoGiaDinhService hoGiaDinhService;

    public HoGiaDinhController(HoGiaDinhService hoGiaDinhService) {
        this.hoGiaDinhService = hoGiaDinhService;
    }

    @GetMapping("/get-by-id")
    public List<HoGiaDinhModel> getById(@RequestParam(value = "id") String id){
        return this.hoGiaDinhService.getById(id);
    }

    @PostMapping("/login")
    public AccountMessageFamily login(@RequestBody HoGiaDinhModel hoGiaDinhModel){
        return this.hoGiaDinhService.login(hoGiaDinhModel);
    }
}
