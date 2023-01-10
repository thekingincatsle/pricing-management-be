//package com.example.pricemanagement.config;
//
//import com.example.pricemanagement.repository.model.ThanhVienModel;
//import com.example.pricemanagement.repository.baseRepository.ThanhVienBaseRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.List;
//
//@Configuration
//public class ThanhVienConfig {
//
//    @Bean(name = "THANHVIEN")
//    CommandLineRunner commandLineRunner(ThanhVienBaseRepository thanhVienBaseRepository){
//        return args -> {
//            ThanhVienModel thanhVienModel1 = new ThanhVienModel("tv1234", "Le Dat", 2005, "GD123");
//            ThanhVienModel thanhVienModel2 = new ThanhVienModel("tv1235", "Pham Dat", 2006, "GD124");
//
//            thanhVienBaseRepository.saveAll(List.of(thanhVienModel1, thanhVienModel2));
//        };
//    }
//}
