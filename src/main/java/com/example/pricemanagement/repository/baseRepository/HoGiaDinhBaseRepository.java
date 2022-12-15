package com.example.pricemanagement.repository.baseRepository;

import com.example.pricemanagement.repository.model.HoGiaDinhModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface HoGiaDinhBaseRepository extends JpaRepository<HoGiaDinhModel, Long>{
}
