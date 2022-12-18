package com.example.pricemanagement.service;
import com.example.pricemanagement.repository.FormDangKyRepository;
import com.example.pricemanagement.repository.model.FormDangKyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;


@Service
public class FormDangKyService {
    private final FormDangKyRepository formDangKyRepository;

    @Autowired
    public FormDangKyService(FormDangKyRepository formDangKyRepository) {
        this.formDangKyRepository = formDangKyRepository;
    }


    public List<FormDangKyModel> getFormDangKy() {
        return formDangKyRepository.getFormDangKy();
    }

    public FormDangKyModel getFormDangKyById(Long id) {
        Optional<FormDangKyModel> response = formDangKyRepository.getFormDangKyById(id);
        FormDangKyModel model = response.get();
        return new FormDangKyModel(model.getMaFormDangKy(), model.getAnhMinhChung(), model.getGiaiThuong(),
                model.getDanhHieu(), model.getTrangThai(), model.getMaGiayKhaiSinh(), model.getEmail());
    }


    public FormDangKyModel addFormDangKy(FormDangKyModel formDangKyModel) {
        formDangKyRepository.addFormDangKy(formDangKyModel);
        return new FormDangKyModel(formDangKyModel.getMaFormDangKy(), formDangKyModel.getAnhMinhChung(), formDangKyModel.getGiaiThuong(),
                formDangKyModel.getDanhHieu(), formDangKyModel.getTrangThai(), formDangKyModel.getMaGiayKhaiSinh(), formDangKyModel.getEmail());
    }

    public FormDangKyModel updateFormDangKy(Long id, FormDangKyModel formDangKyModel) {
        FormDangKyModel model = getFormDangKyById(id);
        model.setTrangThai(formDangKyModel.getTrangThai());
        model.setEmail(formDangKyModel.getEmail());
        model.setDanhHieu(formDangKyModel.getDanhHieu());
        formDangKyRepository.updateFormDangKy(model);
        return  new FormDangKyModel(model.getMaFormDangKy(), model.getAnhMinhChung(), model.getGiaiThuong(),
                model.getDanhHieu(), model.getTrangThai(), model.getMaGiayKhaiSinh(), model.getEmail());

    }
}
