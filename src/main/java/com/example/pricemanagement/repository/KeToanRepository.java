package com.example.pricemanagement.repository;
import com.example.pricemanagement.repository.model.KeToanModel;
import com.example.pricemanagement.repository.baseRepository.KeToanBaseRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class KeToanRepository {
    private final KeToanBaseRepository keToanBaseRepository;

    public KeToanRepository(KeToanBaseRepository keToanBaseRepository) {
        this.keToanBaseRepository = keToanBaseRepository;
    }

    public List<KeToanModel> getKeToanByEmail(String email){
        return this.keToanBaseRepository.getKeToanByEmail(email);
    }
}
