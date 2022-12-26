package com.example.pricemanagement.service;

import com.example.pricemanagement.repository.CanBoRepository;
import com.example.pricemanagement.repository.model.CanBoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CanBoService {
    private final CanBoRepository canBoRepository;

    @Autowired
    public CanBoService(CanBoRepository canBoRepository) {
        this.canBoRepository = canBoRepository;
    }

    public List<CanBoModel> getCanBoByEmail(String email){
        return this.canBoRepository.getCanBoByEmail(email);
    }
}
