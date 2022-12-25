package com.example.pricemanagement.controller;

import com.example.pricemanagement.repository.model.ThanhVienModel;
import com.example.pricemanagement.service.ThanhVienService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/member")
public class ThanhVienController {
    private final ThanhVienService thanhVienService;

    public ThanhVienController(ThanhVienService thanhVienService) {
        this.thanhVienService = thanhVienService;
    }

    @GetMapping("/get-all")
    public List<ThanhVienModel> getThanhVien(){
        return this.thanhVienService.getThanhVien();
    }

    @GetMapping("/get-by-id-shk")
    public List<ThanhVienModel> getThanhVienByIdSoHoKhau(@RequestParam(value = "id_shk") String idSoHoKhau){
        return this.thanhVienService.getThanhVienByIdSoHoKhau(idSoHoKhau);
    }
}
