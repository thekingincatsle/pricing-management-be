package com.example.pricemanagement.repository;

import com.example.pricemanagement.repository.model.HocSinhModel;
import com.example.pricemanagement.repository.baseRepository.HocSinhBaseRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class HocSinhRepository {
    private final HocSinhBaseRepository hocSinhBaseRepository;

    public HocSinhRepository(HocSinhBaseRepository hocSinhBaseRepository) {
        this.hocSinhBaseRepository = hocSinhBaseRepository;
    }

    public List<HocSinhModel> getHocSinh() {
        return this.hocSinhBaseRepository.findAll();
    }
}
