package com.example.pricemanagement.repository;
import com.example.pricemanagement.repository.model.FormDangKyModel;
import com.example.pricemanagement.repository.baseRepository.FormDangKyBaseRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
@Repository
public class FormDangKyRepository {
    private final FormDangKyBaseRepository formDangKyBaseRepository ;

    public FormDangKyRepository(FormDangKyBaseRepository formDangKyBaseRepository) {
        this.formDangKyBaseRepository = formDangKyBaseRepository;
    }


    public List<FormDangKyModel> getFormDangKy() {
        return formDangKyBaseRepository.findAll();
    }

    public Optional<FormDangKyModel> getFormDangKyById(Long id) {
        return formDangKyBaseRepository.findById(id);
    }

    public void addFormDangKy(FormDangKyModel formDangKyModel) {
        formDangKyBaseRepository.save(formDangKyModel);
    }

    public void updateFormDangKy(FormDangKyModel formDangKyModel) {
        formDangKyBaseRepository.save(formDangKyModel);
    }
}
