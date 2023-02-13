package com.example.pricemanagement.service;

import com.example.pricemanagement.repository.model.PhanThuongThieuNhiModel;
import com.example.pricemanagement.repository.PhanThuongThieuNhiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PhanThuongThieuNhiService {
    private final PhanThuongThieuNhiRepository phanThuongThieuNhiRepository;

    @Autowired
    public PhanThuongThieuNhiService(PhanThuongThieuNhiRepository phanThuongThieuNhiRepository) {
        this.phanThuongThieuNhiRepository = phanThuongThieuNhiRepository;
    }

    public List<PhanThuongThieuNhiModel> getAllPhanThuong(){
        return this.phanThuongThieuNhiRepository.getAllPhanThuong();
    }

    public String addPhanThuong(PhanThuongThieuNhiModel phanThuongThieuNhiModel){
        this.phanThuongThieuNhiRepository.addPhanThuong(phanThuongThieuNhiModel);
        return "Thêm phần thưởng thành công";
    }

    public String updatePhanThuong(PhanThuongThieuNhiModel phanThuongThieuNhiModel){
        this.phanThuongThieuNhiRepository.updatePhanThuong(phanThuongThieuNhiModel);
        return "Cập nhật phần thưởng thành công";
    }

    public String deletePhanThuong(PhanThuongThieuNhiModel phanThuongThieuNhiModel){
        this.phanThuongThieuNhiRepository.deletePhanThuong(phanThuongThieuNhiModel);
        return "Xóa phần thưởng thành công";
    }
}
