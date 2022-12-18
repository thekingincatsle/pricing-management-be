package com.example.pricemanagement.config;

import com.example.pricemanagement.repository.model.HoGiaDinhModel;
import com.example.pricemanagement.repository.model.ThanhVienModel;
import com.example.pricemanagement.repository.baseRepository.ThanhVienBaseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ThanhVienConfig {
    private HoGiaDinhConfig hoGiaDinhConfig;

    public ThanhVienConfig(HoGiaDinhConfig hoGiaDinhConfig) {
        this.hoGiaDinhConfig = hoGiaDinhConfig;
    }

    @Bean(name = "THANHVIEN")
    CommandLineRunner commandLineRunner(ThanhVienBaseRepository thanhVienBaseRepository){
        return args -> {
            List<HoGiaDinhModel> temp = hoGiaDinhConfig.getHoGiaDinh();
            ThanhVienModel thanhVienModel1 = new ThanhVienModel("tv1234", "Le Dat", 2005, temp.get(0));
            ThanhVienModel thanhVienModel2 = new ThanhVienModel("tv1235", "Pham Dat", 2006, temp.get(1));

            thanhVienBaseRepository.saveAll(List.of(thanhVienModel1, thanhVienModel2));
        };
    }
}
