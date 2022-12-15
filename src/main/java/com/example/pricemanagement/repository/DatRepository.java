package com.example.pricemanagement.repository;

import com.example.pricemanagement.repository.model.DatModel;
import com.example.pricemanagement.repository.baseRepository.DatBaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DatRepository {
    private final DatBaseRepository datBaseRepository;

    public DatRepository(DatBaseRepository datBaseRepository) {
        this.datBaseRepository = datBaseRepository;
    }

    public List<DatModel> getDat(){
        return datBaseRepository.findAll();
    }
}
