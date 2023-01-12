package com.example.pricemanagement.service;

import com.example.pricemanagement.repository.CanBoRepository;
import com.example.pricemanagement.repository.model.CanBoModel;
import com.example.pricemanagement.type.acountmessage.AccountMessageStaff;
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

    public AccountMessageStaff login(CanBoModel canBoModel){
        List<CanBoModel> fetch = getCanBoByEmail(canBoModel.getEmail());
        AccountMessageStaff response;
        if(fetch.isEmpty()){
            response = new AccountMessageStaff(false, "Sai tài khoản cán bộ");
        }
        else{
            if(fetch.get(0).getPassword().equals(canBoModel.getPassword())){
                response = new AccountMessageStaff(true, "Đăng nhập thành công", fetch.get(0));
            }
            else{
                response = new AccountMessageStaff(false, "Sai mật khẩu cho cán bộ " + fetch.get(0).getEmail());
            }
        }
        return response;
    }
}
