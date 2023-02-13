package com.example.pricemanagement.service;

import com.example.pricemanagement.repository.model.PhanThuongHocSinhGioiModel;
import com.example.pricemanagement.repository.PhanThuongHocSinhGioiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PhanThuongHocSinhGioiService {
    private final PhanThuongHocSinhGioiRepository phanThuongHocSinhGioiRepository;

    @Autowired
    public PhanThuongHocSinhGioiService(PhanThuongHocSinhGioiRepository phanThuongHocSinhGioiRepository) {
        this.phanThuongHocSinhGioiRepository = phanThuongHocSinhGioiRepository;
    }

    public String updatePhanThuong(PhanThuongHocSinhGioiModel phanThuongHocSinhGioiModel){
        this.phanThuongHocSinhGioiRepository.updatePhanThuong(phanThuongHocSinhGioiModel);
        return "Cập nhật phần thưởng thành công";
    }
}
