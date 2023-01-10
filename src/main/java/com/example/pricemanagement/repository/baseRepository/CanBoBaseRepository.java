package com.example.pricemanagement.repository.baseRepository;

import com.example.pricemanagement.repository.model.CanBoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CanBoBaseRepository extends JpaRepository<CanBoModel, Long>{
    @Query(value = "SELECT * FROM canbo WHERE email= :email", nativeQuery = true)
    List<CanBoModel> getCanBoBYEmail(String email);
}
