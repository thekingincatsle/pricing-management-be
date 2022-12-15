package com.example.pricemanagement.service;

import com.example.pricemanagement.repository.model.DatModel;
import com.example.pricemanagement.repository.DatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DatService {
    private final DatRepository datRepository;

    @Autowired
    public DatService(DatRepository datRepository) {
        this.datRepository = datRepository;
    }

    public List<DatModel> getDat(){
        return datRepository.getDat();
    }
}
