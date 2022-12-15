package com.example.pricemanagement.controller;

import com.example.pricemanagement.repository.model.DatModel;
import com.example.pricemanagement.service.DatService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/dat")
public class DatController {
    private final DatService datService;

    public DatController(DatService datService) {
        this.datService = datService;
    }

    @GetMapping
    public List<DatModel> getDat() {
        return datService.getDat();
    }
}
