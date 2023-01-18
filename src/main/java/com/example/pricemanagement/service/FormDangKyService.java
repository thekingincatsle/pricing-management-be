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

    public FormDangKyModel updateFormDangKy(FormDangKyModel formDangKyModel) {
        FormDangKyModel model = getFormDangKyById(formDangKyModel.getId());

        //Update trangThai, danhHieu and CanBo of a register form
        model.setTrangThai(formDangKyModel.getTrangThai());
        model.setCanBo(formDangKyModel.getCanBo());
        model.setDanhHieu(formDangKyModel.getDanhHieu());

        formDangKyRepository.updateFormDangKy(model);
        return getFormDangKyById(formDangKyModel.getId());
    }

    public List<FormDangKyModel> getAcceptedForm(){
        return this.formDangKyRepository.getAcceptedForm();
    }
}
