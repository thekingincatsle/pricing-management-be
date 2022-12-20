package com.example.pricemanagement.repository.baseRepository;

import com.example.pricemanagement.repository.model.HoGiaDinhModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface HoGiaDinhBaseRepository extends JpaRepository<HoGiaDinhModel, Long>{
    @Query(value = "SELECT * FROM hogiadinh WHERE id_so_ho_khau= :id", nativeQuery = true)
    List<HoGiaDinhModel> getById(String id);
}
