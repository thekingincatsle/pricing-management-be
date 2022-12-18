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

    @GetMapping("/get-all")
    public List<FormDangKyModel> getFormDangKy(){
        return formDangKyService.getFormDangKy();
    }

    @GetMapping("/get-by-id")
    public FormDangKyModel getFormDangKyById(@RequestParam(value = "id") Long id) {
        return this.formDangKyService.getFormDangKyById(id);
    }

    @PostMapping("/add")
    public FormDangKyModel addFormDangKy(@RequestBody FormDangKyModel formDangKyModel) {
        return this.formDangKyService.addFormDangKy(formDangKyModel);
    }

    @PutMapping("/update")
    public FormDangKyModel updateFormDangKy(@RequestParam(value = "id") Long id, @RequestBody FormDangKyModel formDangKyModel) {
        return this.formDangKyService.updateFormDangKy(id,formDangKyModel);
    }
}
