package com.example.pricemanagement.repository;

import com.example.pricemanagement.repository.model.XacNhanPhanThuongHocSinhModel;
import com.example.pricemanagement.repository.baseRepository.XacNhanPhanThuongHocSinhBaseRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class XacNhanPhanThuongHocSinhRepository {
    private final XacNhanPhanThuongHocSinhBaseRepository xacNhanPhanThuongHocSinhBaseRepository;

    public XacNhanPhanThuongHocSinhRepository(XacNhanPhanThuongHocSinhBaseRepository xacNhanPhanThuongHocSinhBaseRepository) {
        this.xacNhanPhanThuongHocSinhBaseRepository = xacNhanPhanThuongHocSinhBaseRepository;
    }

    public List<XacNhanPhanThuongHocSinhModel> findByFormId(Long id){
        return this.xacNhanPhanThuongHocSinhBaseRepository.findByFormId(id);
    }

    public void saveXacNhanPhanThuongHocSinh(XacNhanPhanThuongHocSinhModel xacNhanPhanThuongHocSinhModel){
        this.xacNhanPhanThuongHocSinhBaseRepository.save(xacNhanPhanThuongHocSinhModel);
    }

    public List<XacNhanPhanThuongHocSinhModel> findByIdSHK(String idshk){
        return this.xacNhanPhanThuongHocSinhBaseRepository.findByIdSHK(idshk);
    }
}
