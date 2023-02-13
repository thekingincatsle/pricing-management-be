package com.example.pricemanagement.repository.baseRepository;

import com.example.pricemanagement.repository.model.PhanThuongHocSinhGioiModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PhanThuongHocSinhGioiBaseRepository extends JpaRepository <PhanThuongHocSinhGioiModel, Long>{
}
