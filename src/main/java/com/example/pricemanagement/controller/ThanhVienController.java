package com.example.pricemanagement.controller;

import com.example.pricemanagement.repository.model.HocSinhModel;
import com.example.pricemanagement.repository.model.ThanhVienModel;
import com.example.pricemanagement.service.ThanhVienService;
import com.example.pricemanagement.type.AddMember;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/member")
public class ThanhVienController {
    private final ThanhVienService thanhVienService;

    public ThanhVienController(ThanhVienService thanhVienService) {
        this.thanhVienService = thanhVienService;
    }

    //Get members' information by an input family's id
    @GetMapping("/get-by-id-shk")
    public List<ThanhVienModel> getThanhVienByIdSoHoKhau(@RequestParam(value = "id_shk") String idSoHoKhau){
        return this.thanhVienService.getThanhVienByIdSoHoKhau(idSoHoKhau);
    }

    //Get all members with age under or equal to 18
    @GetMapping("/get-children")
    public List<ThanhVienModel> getChildren(){
        return this.thanhVienService.getChildren();
    }

    @PostMapping("add")
    public String addThanhVien(@RequestBody AddMember addMember){
        return this.thanhVienService.addThanhVien(addMember.getThanhVien(), addMember.getHocSinh());
    }

    @DeleteMapping("/delete")
    public String deleteThanhVien(@RequestBody ThanhVienModel thanhVienModel){
        return this.thanhVienService.deleteThanhVien(thanhVienModel);
    }
}
