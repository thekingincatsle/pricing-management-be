package com.example.pricemanagement.repository.baseRepository;

import com.example.pricemanagement.repository.model.FormDangKyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface FormDangKyBaseRepository extends JpaRepository<FormDangKyModel, Long>{
}
