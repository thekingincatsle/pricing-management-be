//package com.example.pricemanagement.config;
//
//import com.example.pricemanagement.repository.model.DatModel;
//import com.example.pricemanagement.repository.baseRepository.DatBaseRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.List;
//
//@Configuration
//public class DatConfig {
//
//    @Bean(name = "dat")
//    CommandLineRunner commandLineRunner(DatBaseRepository datBaseRepository){
//        return args -> {
//            DatModel dat1 = new DatModel("Dat", "deptrai", 20);
//            DatModel dat2 = new DatModel("Dat", "deptrai", 21);
//
//            datBaseRepository.saveAll(List.of(dat1, dat2));
//        };
//    }
//}
