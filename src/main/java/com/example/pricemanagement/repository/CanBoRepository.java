package com.example.pricemanagement.repository;
import com.example.pricemanagement.repository.model.CanBoModel;
import com.example.pricemanagement.repository.baseRepository.CanBoBaseRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class CanBoRepository {
    private final CanBoBaseRepository canBoBaseRepository;

    public CanBoRepository(CanBoBaseRepository canBoBaseRepository) {
        this.canBoBaseRepository = canBoBaseRepository;
    }

    public List<CanBoModel> getCanBoByEmail(String email){
        return this.canBoBaseRepository.getCanBoBYEmail(email);
    }
}
