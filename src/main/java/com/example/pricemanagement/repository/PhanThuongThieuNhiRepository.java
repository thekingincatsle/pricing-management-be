package com.example.pricemanagement.repository;

import com.example.pricemanagement.repository.model.PhanThuongThieuNhiModel;
import com.example.pricemanagement.repository.baseRepository.PhanThuongThieuNhiBaseRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class PhanThuongThieuNhiRepository {
    private final PhanThuongThieuNhiBaseRepository phanThuongThieuNhiBaseRepository;

    public PhanThuongThieuNhiRepository(PhanThuongThieuNhiBaseRepository phanThuongThieuNhiBaseRepository) {
        this.phanThuongThieuNhiBaseRepository = phanThuongThieuNhiBaseRepository;
    }

    public List<PhanThuongThieuNhiModel> getAllPhanThuong(){
        return this.phanThuongThieuNhiBaseRepository.findAll();
    }

    public void addPhanThuong(PhanThuongThieuNhiModel phanThuongThieuNhiModel){
        this.phanThuongThieuNhiBaseRepository.save(phanThuongThieuNhiModel);
    }

    public void updatePhanThuong(PhanThuongThieuNhiModel phanThuongThieuNhiModel){
        this.phanThuongThieuNhiBaseRepository.save(phanThuongThieuNhiModel);
    }

    public void deletePhanThuong(PhanThuongThieuNhiModel phanThuongThieuNhiModel){
        this.phanThuongThieuNhiBaseRepository.delete(phanThuongThieuNhiModel);
    }
}
