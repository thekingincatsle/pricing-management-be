package com.example.pricemanagement.config;

import com.example.pricemanagement.repository.model.HoGiaDinhModel;
import com.example.pricemanagement.repository.baseRepository.HoGiaDinhBaseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class HoGiaDinhConfig {

    @Bean(name = "HOGIADINH")
    CommandLineRunner commandLineRunner(HoGiaDinhBaseRepository hoGiaDinhBaseRepository){
        return args -> {
            HoGiaDinhModel hoGiaDinhModel1 = new HoGiaDinhModel("GD123", "1234", "Tran Dat");
            HoGiaDinhModel hoGiaDinhModel2 = new HoGiaDinhModel("GD124", "12345", "Nguyen Dat");

            hoGiaDinhBaseRepository.saveAll(List.of(hoGiaDinhModel1, hoGiaDinhModel2));
        };
    }
}
