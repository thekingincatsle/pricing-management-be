package com.example.pricemanagement.controller;

import com.example.pricemanagement.repository.model.PhanThuongThieuNhiModel;
import com.example.pricemanagement.service.PhanThuongThieuNhiService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/children-gift")
public class PhanThuongThieuNhiController {
    private final PhanThuongThieuNhiService phanThuongThieuNhiService;

    public PhanThuongThieuNhiController(PhanThuongThieuNhiService phanThuongThieuNhiService) {
        this.phanThuongThieuNhiService = phanThuongThieuNhiService;
    }

    @GetMapping("/get-all")
    public List<PhanThuongThieuNhiModel> getAllPhanThuong(){
        return this.phanThuongThieuNhiService.getAllPhanThuong();
    }

    @PostMapping("/add")
    public String addPhanThuong(@RequestBody PhanThuongThieuNhiModel phanThuongThieuNhiModel){
        return this.phanThuongThieuNhiService.addPhanThuong(phanThuongThieuNhiModel);
    }

    @PutMapping("/update")
    public String updatePhanThuong(@RequestBody PhanThuongThieuNhiModel phanThuongThieuNhiModel){
        return this.phanThuongThieuNhiService.updatePhanThuong(phanThuongThieuNhiModel);
    }

    @DeleteMapping("/delete")
    public String deletePhanThuong(@RequestBody PhanThuongThieuNhiModel phanThuongThieuNhiModel){
        return this.phanThuongThieuNhiService.deletePhanThuong(phanThuongThieuNhiModel);
    }
}
