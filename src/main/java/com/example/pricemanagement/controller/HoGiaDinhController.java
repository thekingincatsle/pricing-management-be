package com.example.pricemanagement.controller;

import com.example.pricemanagement.repository.model.HoGiaDinhModel;
import com.example.pricemanagement.service.HoGiaDinhService;
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
}
