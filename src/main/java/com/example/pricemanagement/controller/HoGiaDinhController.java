package com.example.pricemanagement.controller;

import com.example.pricemanagement.repository.model.HoGiaDinhModel;
import com.example.pricemanagement.service.HoGiaDinhService;
import com.example.pricemanagement.type.accountmessage.AccountMessageFamily;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/family")
public class HoGiaDinhController {
    private final HoGiaDinhService hoGiaDinhService;

    public HoGiaDinhController(HoGiaDinhService hoGiaDinhService) {
        this.hoGiaDinhService = hoGiaDinhService;
    }

    @GetMapping("/get-all")
    public List<HoGiaDinhModel> getHoGiaDinh(){
        return this.hoGiaDinhService.getHoGiaDinh();
    }

    //Get family information by an input id
    @GetMapping("/get-by-id")
    public List<HoGiaDinhModel> getById(@RequestParam(value = "id") String id){
        return this.hoGiaDinhService.getById(id);
    }

    //Validate family's login information
    @PostMapping("/login")
    public AccountMessageFamily login(@RequestBody HoGiaDinhModel hoGiaDinhModel){
        return this.hoGiaDinhService.login(hoGiaDinhModel);
    }

    @PostMapping("add")
    public String addHoGiaDinh(@RequestBody HoGiaDinhModel hoGiaDinhModel){
        return this.hoGiaDinhService.addHoGiaDinh(hoGiaDinhModel);
    }

    @DeleteMapping("delete")
    public String deleteHoGiaDinh(@RequestBody HoGiaDinhModel hoGiaDinhModel){
        return this.hoGiaDinhService.deleteHoGiaDinh(hoGiaDinhModel);
    }
}
