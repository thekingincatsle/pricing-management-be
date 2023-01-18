package com.example.pricemanagement.service;

import com.example.pricemanagement.repository.HocSinhRepository;
import com.example.pricemanagement.repository.model.HocSinhModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class HocSinhService {
    private final HocSinhRepository hocSinhRepository;
    private final ThanhVienService thanhVienService;

    @Autowired
    public HocSinhService(HocSinhRepository hocSinhRepository, ThanhVienService thanhVienService) {
        this.hocSinhRepository = hocSinhRepository;
        this.thanhVienService = thanhVienService;
    }

    public List<HocSinhModel> getHocSinhById(String maGiayKhaiSinh){
        return this.hocSinhRepository.getHocSinhByGKS(maGiayKhaiSinh);
    }

    public List<HocSinhModel> getHocSinhByIdshk(String idSoHoKhau){
        return this.hocSinhRepository.getHocSinhByIdshk(idSoHoKhau);
    }
}
