package com.example.pricemanagement.controller;

import com.example.pricemanagement.repository.model.FormDangKyModel;
import com.example.pricemanagement.service.FormDangKyService;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping(path = "api/register-form")

public class FormDangKyController {
    private final FormDangKyService formDangKyService;

    public FormDangKyController(FormDangKyService formDangKyService) {
        this.formDangKyService = formDangKyService;
    }

    //Get all register forms' information
    @GetMapping("/get-all")
    public List<FormDangKyModel> getFormDangKy(){
        return formDangKyService.getFormDangKy();
    }

    //Get register form's information by an input form's id
    @GetMapping("/get-by-id")
    public FormDangKyModel getFormDangKyById(@RequestParam(value = "id") Long id) {
        return this.formDangKyService.getFormDangKyById(id);
    }

    //Add a register form
    @PostMapping("/add")
    public FormDangKyModel addFormDangKy(@RequestBody FormDangKyModel formDangKyModel) {
        return this.formDangKyService.addFormDangKy(formDangKyModel);
    }

    //Update trangThai, danhHieu and canBo of a register form
    @PutMapping("/update")
    public FormDangKyModel updateFormDangKy(@RequestBody FormDangKyModel formDangKyModel) {
        return this.formDangKyService.updateFormDangKy(formDangKyModel);
    }

    //Get information of all accepted register form
    @GetMapping("/get-accepted-form")
    public List<FormDangKyModel> getAcceptedForm(){
        return this.formDangKyService.getAcceptedForm();
    }

    @GetMapping("/get-by-status")
    public List<FormDangKyModel> getFormByStatus(@RequestParam(name = "status") String status){
        return this.formDangKyService.getFormByStatus(status);
    }

    @GetMapping("/get-by-birth-year")
    public List<FormDangKyModel> getFormByBirthYear(@RequestParam(name = "year") int year){
        return this.formDangKyService.getFormByBirthYear(year);
    }

    @GetMapping("/get-by-name")
    public List<FormDangKyModel> getFormByName(@RequestParam(name = "name") String name){
        return this.formDangKyService.getFormByName(name);
    }

    @GetMapping("/get-by-id-shk")
    public List<FormDangKyModel> getFormByIDSHK(@RequestParam(name = "id_shk") String id_shk){
        return this.formDangKyService.getFormByIDSHK(id_shk);
    }

    @GetMapping("/sorting")
    public List<FormDangKyModel> getFormSortByField(@RequestParam(value = "sort") String sort,
                                                    @RequestParam(value = "sortField") String field){
        return this.formDangKyService.getFormSortByField(field, sort);
    }

    @GetMapping("/get-accepted-form-by-birth-year")
    public List<FormDangKyModel> getAcceptedFormByBirthYear(@RequestParam(name = "year") int year){
        return this.formDangKyService.getAcceptedFormByBirthYear(year);
    }

    @GetMapping("/get-accepted-form-by-name")
    public List<FormDangKyModel> getAcceptedFormByName(@RequestParam(name = "name") String name){
        return this.formDangKyService.getAcceptedFormByName(name);
    }

    @GetMapping("/get-accepted-form-by-id-shk")
    public List<FormDangKyModel> getAcceptedFormByIDSHK(@RequestParam(name = "id_shk") String id_shk){
        return this.formDangKyService.getAcceptedFormByIDSHK(id_shk);
    }

    @GetMapping("/get-accepted-form-by-admin")
    public List<FormDangKyModel> getAcceptedFormByAdmin(@RequestParam(name = "name") String name){
        return this.formDangKyService.getAcceptedFormByAdmin(name);
    }

    @GetMapping("/get-accepted-form-by-title")
    public List<FormDangKyModel> getAcceptedFormByTitle(@RequestParam(name = "name") String name){
        return this.formDangKyService.getAcceptedFormByTitle(name);
    }

    @GetMapping("/sorting-accepted")
    public List<FormDangKyModel> getAcceptedFormSortByField(@RequestParam(value = "sort") String sort,
                                                    @RequestParam(value = "sortField") String field){
        return this.formDangKyService.getAcceptedFormSortByField(field, sort);
    }
}
