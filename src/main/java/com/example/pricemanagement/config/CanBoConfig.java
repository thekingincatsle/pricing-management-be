//package com.example.pricemanagement.config;
//
//import com.example.pricemanagement.repository.model.CanBoModel;
//import com.example.pricemanagement.repository.baseRepository.CanBoBaseRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.List;
//
//@Configuration
//public class CanBoConfig {
//
//    @Bean(name = "CANBO")
//    CommandLineRunner commandLineRunner(CanBoBaseRepository canBoBaseRepository){
//        return args -> {
//            CanBoModel canBoModel = new CanBoModel("dat@gmail.com", "Dat", "datdeptrai1");
//
//            canBoBaseRepository.saveAll(List.of(canBoModel));
//        };
//    }
//}
