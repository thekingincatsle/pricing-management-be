package com.example.pricemanagement.service;

import com.example.pricemanagement.repository.HoGiaDinhRepository;
import com.example.pricemanagement.repository.model.HoGiaDinhModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class HoGiaDinhService {
    private final HoGiaDinhRepository hoGiaDinhRepository;

    public HoGiaDinhService(HoGiaDinhRepository hoGiaDinhRepository) {
        this.hoGiaDinhRepository = hoGiaDinhRepository;
    }

    public List<HoGiaDinhModel> getById(String id){
        return this.hoGiaDinhRepository.getById(id);
    }
}
