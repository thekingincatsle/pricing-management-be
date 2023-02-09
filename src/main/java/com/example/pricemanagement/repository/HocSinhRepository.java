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

    public List<HocSinhModel> getHocSinhByGKS(String id) {
        return this.hocSinhBaseRepository.getHocSinhByGKS(id);
    }

    public List<HocSinhModel> getHocSinhByIdshk(String idSoHoKhau) {
        return this.hocSinhBaseRepository.getHocSinhByIdshk(idSoHoKhau);
    }

    public void addHocSinh(HocSinhModel hocSinhModel){
        this.hocSinhBaseRepository.save(hocSinhModel);
    }

    public void deleteHocSinh(HocSinhModel hocSinhModel){
        this.hocSinhBaseRepository.delete(hocSinhModel);
    }
}
