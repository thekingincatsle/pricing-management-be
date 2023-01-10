package com.example.pricemanagement.service;

import com.example.pricemanagement.repository.ThanhVienRepository;
import com.example.pricemanagement.repository.model.ThanhVienModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class ThanhVienService {
    private final ThanhVienRepository thanhVienRepository;

    @Autowired
    public ThanhVienService(ThanhVienRepository thanhVienRepository) {
        this.thanhVienRepository = thanhVienRepository;
    }

    public List<ThanhVienModel> getThanhVien(){
        return thanhVienRepository.getThanhVien();
    }

    public List<ThanhVienModel> getThanhVienByIdSoHoKhau(String idSoHoKhau){
        return this.thanhVienRepository.getThanhVienByIdSoHoKhau(idSoHoKhau);
    }

    public List<ThanhVienModel> getChildren(){
        return thanhVienRepository.getChildren();
    }
}
