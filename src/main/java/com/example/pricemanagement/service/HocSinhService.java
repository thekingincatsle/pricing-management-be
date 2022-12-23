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

    public List<HocSinhModel> getHocSinh(){
        return this.hocSinhRepository.getHocSinh();
    }

    public List<HocSinhModel> getHocSinhById(String maGiayKhaiSinh){
        List<HocSinhModel> fetch = getHocSinh();
        List<HocSinhModel> response = fetch.stream().filter(hs->hs.getMaGiayKhaiSinh().equals(maGiayKhaiSinh)).collect(Collectors.toList());
        return response;
    }
}
