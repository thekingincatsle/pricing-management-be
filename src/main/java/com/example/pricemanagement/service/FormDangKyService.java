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
        return model;
    }


    public FormDangKyModel addFormDangKy(FormDangKyModel formDangKyModel) {
        formDangKyRepository.addFormDangKy(formDangKyModel);
        return formDangKyModel;
    }

    public FormDangKyModel updateFormDangKy(Long id, FormDangKyModel formDangKyModel) {
        FormDangKyModel model = getFormDangKyById(id);
        model.setTrangThai(formDangKyModel.getTrangThai());
        model.setEmail(formDangKyModel.getEmail());
        model.setDanhHieu(formDangKyModel.getDanhHieu());
        formDangKyRepository.updateFormDangKy(model);
        return model;
    }

    public List<FormDangKyModel> getFormWithStudent(){
        return this.formDangKyRepository.getFormWithStudent();
    }

    public List<FormDangKyModel> getAcceptedForm(){
        return this.formDangKyRepository.getAcceptedForm();
    }
}
