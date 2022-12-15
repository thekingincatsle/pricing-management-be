package com.example.pricemanagement.config;

import com.example.pricemanagement.repository.model.HocSinhModel;
import com.example.pricemanagement.repository.baseRepository.HocSinhBaseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class HocSinhConfig {

    @Bean(name = "HOCSINH")
    CommandLineRunner commandLineRunner(HocSinhBaseRepository hocSinhBaseRepository){
        return args -> {
            HocSinhModel hocSinhModel1 = new HocSinhModel("tv1234", "NamDinh", "13A");

            hocSinhBaseRepository.saveAll(List.of(hocSinhModel1));
        };
    }
}
