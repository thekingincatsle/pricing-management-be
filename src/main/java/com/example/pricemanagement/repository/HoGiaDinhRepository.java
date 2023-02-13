package com.example.pricemanagement.repository;

import com.example.pricemanagement.repository.model.HoGiaDinhModel;
import com.example.pricemanagement.repository.baseRepository.HoGiaDinhBaseRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class HoGiaDinhRepository {
    private final HoGiaDinhBaseRepository hoGiaDinhBaseRepository;

    public HoGiaDinhRepository(HoGiaDinhBaseRepository hoGiaDinhBaseRepository) {
        this.hoGiaDinhBaseRepository = hoGiaDinhBaseRepository;
    }

    public List<HoGiaDinhModel> getHoGiaDinh(){
        return this.hoGiaDinhBaseRepository.findAll();
    }

    public List<HoGiaDinhModel> getById(String id){
        return this.hoGiaDinhBaseRepository.getById(id);
    }

    public void addHoGiaDinh(HoGiaDinhModel hoGiaDinhModel){
        this.hoGiaDinhBaseRepository.save(hoGiaDinhModel);
    }

    public void deleteHoGiaDinh(HoGiaDinhModel hoGiaDinhModel){
        this.hoGiaDinhBaseRepository.delete(hoGiaDinhModel);
    }
}
