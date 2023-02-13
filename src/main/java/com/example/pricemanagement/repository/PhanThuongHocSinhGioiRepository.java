package com.example.pricemanagement.repository;

import com.example.pricemanagement.repository.model.PhanThuongHocSinhGioiModel;
import com.example.pricemanagement.repository.baseRepository.PhanThuongHocSinhGioiBaseRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class PhanThuongHocSinhGioiRepository {
    private final PhanThuongHocSinhGioiBaseRepository phanThuongHocSinhGioiBaseRepository;

    public PhanThuongHocSinhGioiRepository(PhanThuongHocSinhGioiBaseRepository phanThuongHocSinhGioiBaseRepository) {
        this.phanThuongHocSinhGioiBaseRepository = phanThuongHocSinhGioiBaseRepository;
    }

    public void updatePhanThuong(PhanThuongHocSinhGioiModel phanThuongHocSinhGioiModel){
        this.phanThuongHocSinhGioiBaseRepository.save(phanThuongHocSinhGioiModel);
    }
}
