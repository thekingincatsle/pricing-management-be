package com.example.pricemanagement.repository.baseRepository;

import com.example.pricemanagement.repository.model.XacNhanPhanThuongHocSinhModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface XacNhanPhanThuongHocSinhBaseRepository extends JpaRepository<XacNhanPhanThuongHocSinhModel, Long> {
    @Query(value = "SELECT * FROM xacnhanphanthuonghocsinh WHERE id = :id", nativeQuery = true)
    public List<XacNhanPhanThuongHocSinhModel> findByFormId(Long id);
}
