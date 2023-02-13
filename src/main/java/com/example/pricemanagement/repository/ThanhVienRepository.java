package com.example.pricemanagement.repository;

import com.example.pricemanagement.repository.model.ThanhVienModel;
import com.example.pricemanagement.repository.baseRepository.ThanhVienBaseRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class ThanhVienRepository {
    private final ThanhVienBaseRepository thanhVienBaseRepository;

    public ThanhVienRepository(ThanhVienBaseRepository thanhVienBaseRepository) {
        this.thanhVienBaseRepository = thanhVienBaseRepository;
    }

    public List<ThanhVienModel> getThanhVienByIdSoHoKhau(String id){
        return thanhVienBaseRepository.getThanhVienByIdSoHoKhau(id);
    }

    public List<ThanhVienModel> getChildren(){
        return thanhVienBaseRepository.getChildren();
    }

    public void addThanhVien(ThanhVienModel thanhVienModel){
        this.thanhVienBaseRepository.save(thanhVienModel);
    }

    public void deleteThanhVien(ThanhVienModel thanhVienModel){
        this.thanhVienBaseRepository.delete(thanhVienModel);
    }
}
