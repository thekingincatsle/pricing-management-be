package com.example.pricemanagement.controller;

import com.example.pricemanagement.repository.model.HocSinhModel;
import com.example.pricemanagement.service.HocSinhService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/student")
public class HocSinhController {
    private final HocSinhService hocSinhService;

    public HocSinhController(HocSinhService hocSinhService) {
        this.hocSinhService = hocSinhService;
    }

    @GetMapping("/get-by-id")
    public List<HocSinhModel> getHocSinhById(@RequestParam(value = "id") String id){
        return this.hocSinhService.getHocSinhById(id);
    }
}
