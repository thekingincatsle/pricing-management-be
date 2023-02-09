package com.example.pricemanagement.service;

import com.example.pricemanagement.repository.FormDangKyRepository;
import com.example.pricemanagement.repository.HoGiaDinhRepository;
import com.example.pricemanagement.repository.HocSinhRepository;
import com.example.pricemanagement.repository.ThanhVienRepository;
import com.example.pricemanagement.repository.model.HocSinhModel;
import com.example.pricemanagement.repository.model.ThanhVienModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class ThanhVienService {
    private final ThanhVienRepository thanhVienRepository;
    private final HocSinhRepository hocSinhRepository;
    private final FormDangKyRepository formDangKyRepository;

    @Autowired
    public ThanhVienService(ThanhVienRepository thanhVienRepository, HocSinhRepository hocSinhRepository, FormDangKyRepository formDangKyRepository) {
        this.thanhVienRepository = thanhVienRepository;
        this.hocSinhRepository = hocSinhRepository;
        this.formDangKyRepository = formDangKyRepository;
    }

    public List<ThanhVienModel> getThanhVienByIdSoHoKhau(String idSoHoKhau){
        return this.thanhVienRepository.getThanhVienByIdSoHoKhau(idSoHoKhau);
    }

    public List<ThanhVienModel> getChildren(){
        return thanhVienRepository.getChildren();
    }

    public String addThanhVien(ThanhVienModel thanhVienModel, HocSinhModel hocSinhModel){
        if(hocSinhModel != null){
            this.hocSinhRepository.addHocSinh(hocSinhModel);
        }
        this.thanhVienRepository.addThanhVien(thanhVienModel);
        return "Thêm thành công thành viên " + thanhVienModel.getTen() + " vào hộ gia đình " + thanhVienModel.getHoGiaDinh().getIdSoHoKhau();
    }

    public String deleteThanhVien(ThanhVienModel thanhVienModel){
        List<HocSinhModel> hocSinhModels = this.hocSinhRepository.getHocSinhByGKS(thanhVienModel.getMaGiayKhaiSinh());
        if(hocSinhModels.size() != 0){
            this.formDangKyRepository.deleteFormDangKy(hocSinhModels.get(0).getFormDangKyModels());
            this.hocSinhRepository.deleteHocSinh(hocSinhModels.get(0));
        }
        this.thanhVienRepository.deleteThanhVien(thanhVienModel);
        return "Xóa thành công thành viên " + thanhVienModel.getTen();
    }
}
