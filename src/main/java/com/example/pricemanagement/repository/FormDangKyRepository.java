package com.example.pricemanagement.repository;
import com.example.pricemanagement.repository.model.FormDangKyModel;
import com.example.pricemanagement.repository.baseRepository.FormDangKyBaseRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
@Repository
public class FormDangKyRepository {
    private final FormDangKyBaseRepository formDangKyBaseRepository ;

    public FormDangKyRepository(FormDangKyBaseRepository formDangKyBaseRepository) {
        this.formDangKyBaseRepository = formDangKyBaseRepository;
    }


    public List<FormDangKyModel> getFormDangKy() {
        return formDangKyBaseRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
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

    public List<FormDangKyModel> getAcceptedForm(){
        return this.formDangKyBaseRepository.getAcceptedForm();
    }

    public List<FormDangKyModel> getFormByStatus(String status){
        return this.formDangKyBaseRepository.getFormByStatus(status);
    }

    public List<FormDangKyModel> getFormByBirthYear(int year){
        return this.formDangKyBaseRepository.getFormByBirthYear(year);
    }

    public List<FormDangKyModel> getFormByName(String name){
        return this.formDangKyBaseRepository.getFormByName(name);
    }

    public List<FormDangKyModel> getFormByIDSHK(String id_shk){
        return this.formDangKyBaseRepository.getFormByIDSHK(id_shk);
    }

    public List<FormDangKyModel> getFormSortByNameAsc(){
        return formDangKyBaseRepository.getFormSortByNameAsc();
    }

    public List<FormDangKyModel> getFormSortByNameDesc(){
        return formDangKyBaseRepository.getFormSortByNameDesc();
    }

    public List<FormDangKyModel> getFormSortByYearAsc(){
        return formDangKyBaseRepository.getFormSortByYearAsc();
    }

    public List<FormDangKyModel> getFormSortByYearDesc(){
        return formDangKyBaseRepository.getFormSortByYearDesc();
    }

    public List<FormDangKyModel> getFormSortByIDSHKAsc(){
        return formDangKyBaseRepository.getFormSortByIDSHKAsc();
    }

    public List<FormDangKyModel> getFormSortByIDSHKDesc(){
        return formDangKyBaseRepository.getFormSortByIDSHKDesc();
    }

    public List<FormDangKyModel> getFormSortByStateAsc(){
        return formDangKyBaseRepository.getFormSortByStateAsc();
    }

    public List<FormDangKyModel> getFormSortByStateDesc(){
        return formDangKyBaseRepository.getFormSortByStateDesc();
    }

    public List<FormDangKyModel> getAcceptedFormByBirthYear(int year){
        return this.formDangKyBaseRepository.getAcceptedFormByBirthYear(year);
    }

    public List<FormDangKyModel> getAcceptedFormByName(String name){
        return this.formDangKyBaseRepository.getAcceptedFormByName(name);
    }

    public List<FormDangKyModel> getAcceptedFormByIDSHK(String id_shk){
        return this.formDangKyBaseRepository.getAcceptedFormByIDSHK(id_shk);
    }

    public List<FormDangKyModel> getAcceptedFormByAdmin(String name){
        return this.formDangKyBaseRepository.getAcceptedFormByAdmin(name);
    }

    public List<FormDangKyModel> getAcceptedFormByTitle(String name){
        return this.formDangKyBaseRepository.getAcceptedFormByTitle(name);
    }

    public List<FormDangKyModel> getAcceptedFormSortByNameAsc(){
        return formDangKyBaseRepository.getAcceptedFormSortByNameAsc();
    }

    public List<FormDangKyModel> getAcceptedFormSortByNameDesc(){
        return formDangKyBaseRepository.getAcceptedFormSortByNameDesc();
    }

    public List<FormDangKyModel> getAcceptedFormSortByYearAsc(){
        return formDangKyBaseRepository.getAcceptedFormSortByYearAsc();
    }

    public List<FormDangKyModel> getAcceptedFormSortByYearDesc(){
        return formDangKyBaseRepository.getAcceptedFormSortByYearDesc();
    }

    public List<FormDangKyModel> getAcceptedFormSortByIDSHKAsc(){
        return formDangKyBaseRepository.getAcceptedFormSortByIDSHKAsc();
    }

    public List<FormDangKyModel> getAcceptedFormSortByIDSHKDesc(){
        return formDangKyBaseRepository.getAcceptedFormSortByIDSHKDesc();
    }

    public List<FormDangKyModel> getAcceptedFormSortByTitleAsc(){
        return formDangKyBaseRepository.getAcceptedFormSortByTitleAsc();
    }

    public List<FormDangKyModel> getAcceptedFormSortByTitleDesc(){
        return formDangKyBaseRepository.getAcceptedFormSortByTitleDesc();
    }

    public List<FormDangKyModel> getAcceptedFormSortByAdminAsc(){
        return formDangKyBaseRepository.getAcceptedFormSortByAdminAsc();
    }

    public List<FormDangKyModel> getAcceptedFormSortByAdminDesc(){
        return formDangKyBaseRepository.getAcceptedFormSortByAdminDesc();
    }

    public List<FormDangKyModel> getAcceptedFormSortByPrizeAsc(){
        return formDangKyBaseRepository.getAcceptedFormSortByPrizeAsc();
    }

    public List<FormDangKyModel> getAcceptedFormSortByPrizeDesc(){
        return formDangKyBaseRepository.getAcceptedFormSortByPrizeDesc();
    }


    public List<FormDangKyModel> getAcceptedFormByYear(int year){
        return this.formDangKyBaseRepository.getAcceptedFormByYear(year);
    }
}
