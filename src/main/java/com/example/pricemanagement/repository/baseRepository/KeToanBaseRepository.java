package com.example.pricemanagement.repository.baseRepository;

import com.example.pricemanagement.repository.model.KeToanModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface KeToanBaseRepository extends JpaRepository<KeToanModel, Long> {
    @Query(value = "SELECT * FROM ketoan WHERE email= :email", nativeQuery = true)
    List<KeToanModel> getKeToanByEmail(String email);
}
