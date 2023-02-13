package com.example.pricemanagement.controller;

import com.example.pricemanagement.repository.model.PhanThuongHocSinhGioiModel;
import com.example.pricemanagement.service.PhanThuongHocSinhGioiService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student-gift")
public class PhanThuongHocSinhGioiController {
    private final PhanThuongHocSinhGioiService phanThuongHocSinhGioiService;

    public PhanThuongHocSinhGioiController(PhanThuongHocSinhGioiService phanThuongHocSinhGioiService) {
        this.phanThuongHocSinhGioiService = phanThuongHocSinhGioiService;
    }

    @PutMapping("/update")
    public String updatePhanThuong(@RequestBody PhanThuongHocSinhGioiModel phanThuongHocSinhGioiModel){
        return this.phanThuongHocSinhGioiService.updatePhanThuong(phanThuongHocSinhGioiModel);
    }
}
