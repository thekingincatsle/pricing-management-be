package com.example.pricemanagement.repository.baseRepository;

import com.example.pricemanagement.repository.model.PhanThuongThieuNhiModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PhanThuongThieuNhiBaseRepository extends JpaRepository<PhanThuongThieuNhiModel, Long>{
}
