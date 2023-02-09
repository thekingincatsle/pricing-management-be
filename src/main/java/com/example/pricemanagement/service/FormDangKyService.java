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
        return formDangKyRepository.getAcceptedForm();
    }

    public List<FormDangKyModel> getFormByStatus(String status){
        return formDangKyRepository.getFormByStatus(status);
    }

    public List<FormDangKyModel> getFormByBirthYear(int year){
        return formDangKyRepository.getFormByBirthYear(year);
    }

    public List<FormDangKyModel> getFormByName(String name){
        return formDangKyRepository.getFormByName(name);
    }

    public List<FormDangKyModel> getFormByIDSHK(String id_shk){
        return formDangKyRepository.getFormByIDSHK(id_shk);
    }

    public List<FormDangKyModel> getFormSortByField(String field, String sort){
        if(field.equals("ten")){
            if(sort.equals("asc")){
                return formDangKyRepository.getFormSortByNameAsc();
            }
            else{
                return formDangKyRepository.getFormSortByNameDesc();
            }
        }
        else if(field.equals("tuoi")){
            if(sort.equals("desc")){
                return formDangKyRepository.getFormSortByYearAsc();
            }
            else{
                return formDangKyRepository.getFormSortByYearDesc();
            }
        }
        else if(field.equals("id_so_ho_khau")){
            if(sort.equals("asc")){
                return formDangKyRepository.getFormSortByIDSHKAsc();
            }
            else{
                return formDangKyRepository.getFormSortByIDSHKDesc();
            }
        }
        else if(field.equals("trang_thai")){
            if(sort.equals("asc")){
                return formDangKyRepository.getFormSortByStateAsc();
            }
            else{
                return formDangKyRepository.getFormSortByStateDesc();
            }
        }
        else{
            return null;
        }
    }

    public List<FormDangKyModel> getAcceptedFormByBirthYear(int year){
        return formDangKyRepository.getAcceptedFormByBirthYear(year);
    }

    public List<FormDangKyModel> getAcceptedFormByName(String name){
        return formDangKyRepository.getAcceptedFormByName(name);
    }

    public List<FormDangKyModel> getAcceptedFormByIDSHK(String id_shk){
        return formDangKyRepository.getAcceptedFormByIDSHK(id_shk);
    }

    public List<FormDangKyModel> getAcceptedFormByAdmin(String name){
        return formDangKyRepository.getAcceptedFormByAdmin(name);
    }

    public List<FormDangKyModel> getAcceptedFormByTitle(String name){
        return formDangKyRepository.getAcceptedFormByTitle(name);
    }

    public List<FormDangKyModel> getAcceptedFormSortByField(String field, String sort){
        if(field.equals("ten")){
            if(sort.equals("asc")){
                return formDangKyRepository.getAcceptedFormSortByNameAsc();
            }
            else{
                return formDangKyRepository.getAcceptedFormSortByNameDesc();
            }
        }
        else if(field.equals("tuoi")){
            if(sort.equals("desc")){
                return formDangKyRepository.getAcceptedFormSortByYearAsc();
            }
            else{
                return formDangKyRepository.getAcceptedFormSortByYearDesc();
            }
        }
        else if(field.equals("id_so_ho_khau")){
            if(sort.equals("asc")){
                return formDangKyRepository.getAcceptedFormSortByIDSHKAsc();
            }
            else{
                return formDangKyRepository.getAcceptedFormSortByIDSHKDesc();
            }
        }
        else if(field.equals("ten_danh_hieu")){
            if(sort.equals("asc")){
                return formDangKyRepository.getAcceptedFormSortByTitleAsc();
            }
            else{
                return formDangKyRepository.getAcceptedFormSortByTitleDesc();
            }
        }
        else if(field.equals("ten_can_bo")){
            if(sort.equals("asc")){
                return formDangKyRepository.getAcceptedFormSortByAdminAsc();
            }
            else{
                return formDangKyRepository.getAcceptedFormSortByAdminDesc();
            }
        }
        else if(field.equals("ten_phan_thuong")){
            if(sort.equals("asc")){
                return formDangKyRepository.getAcceptedFormSortByPrizeAsc();
            }
            else{
                return formDangKyRepository.getAcceptedFormSortByPrizeDesc();
            }
        }
        else{
            return null;
        }
    }

    public List<FormDangKyModel> getAcceptedFormByYear(int year){
        return formDangKyRepository.getAcceptedFormByYear(year);
    }
}
