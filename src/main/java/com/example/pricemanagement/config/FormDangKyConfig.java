//package com.example.pricemanagement.config;
//
//import com.example.pricemanagement.repository.model.FormDangKyModel;
//import com.example.pricemanagement.repository.baseRepository.FormDangKyBaseRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import com.example.pricemanagement.enumType.FormTrangThaiEnum;
//
//import java.util.List;
//
//@Configuration
//public class FormDangKyConfig {
//
//    @Bean(name = "FORMDANGKY")
//    CommandLineRunner commandLineRunner(FormDangKyBaseRepository formDangKyBaseRepository){
//        return args -> {
//            FormDangKyModel formDangKyModel1 = new FormDangKyModel("url1", "NhatThanhPho", FormTrangThaiEnum.DANGCHO.trangThai(), "tv1234");
//            FormDangKyModel formDangKyModel2 = new FormDangKyModel("url2", "NhatQuocGia", FormTrangThaiEnum.DANGCHO.trangThai(), "tv1234");
//
//            formDangKyBaseRepository.saveAll(List.of(formDangKyModel1, formDangKyModel2));
//        };
//    }
//}
