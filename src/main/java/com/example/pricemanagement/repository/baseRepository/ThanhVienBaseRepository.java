package com.example.pricemanagement.repository.baseRepository;

import com.example.pricemanagement.repository.model.ThanhVienModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ThanhVienBaseRepository extends JpaRepository<ThanhVienModel, Long>{
    @Query(value = "SELECT * FROM thanhvien WHERE id_so_ho_khau= :id", nativeQuery = true)
    List<ThanhVienModel> getThanhVienByIdSoHoKhau(String id);

    @Query(value = "SELECT * FROM thanhvien WHERE (extract(year from now()) - nam_sinh) <= 18", nativeQuery = true)
    List<ThanhVienModel> getChildren();
}
