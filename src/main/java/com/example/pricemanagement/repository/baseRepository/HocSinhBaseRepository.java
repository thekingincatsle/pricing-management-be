package com.example.pricemanagement.repository.baseRepository;

import com.example.pricemanagement.repository.model.HocSinhModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface HocSinhBaseRepository extends JpaRepository<HocSinhModel, Long> {
}
