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
}
