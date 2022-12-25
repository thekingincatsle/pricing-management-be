package com.example.pricemanagement.repository.baseRepository;

import com.example.pricemanagement.repository.model.HocSinhModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface HocSinhBaseRepository extends JpaRepository<HocSinhModel, Long> {
    @Query(value = "SELECT * FROM hocsinh hs INNER JOIN thanhvien tv ON hs.ma_giay_khai_sinh = tv.ma_giay_khai_sinh", nativeQuery = true)
    List<HocSinhModel> getHocSinh();
    @Query(value = "SELECT * FROM hocsinh WHERE ma_giay_khai_sinh= :id", nativeQuery = true)
    List<HocSinhModel> getHocSinhByGKS(String id);
}
