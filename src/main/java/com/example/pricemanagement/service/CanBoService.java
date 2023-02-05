package com.example.pricemanagement.service;

import com.example.pricemanagement.repository.CanBoRepository;
import com.example.pricemanagement.repository.model.CanBoModel;
import com.example.pricemanagement.type.accountmessage.AccountMessageAdmin;
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

    public AccountMessageAdmin login(CanBoModel canBoModel){
        List<CanBoModel> fetch = getCanBoByEmail(canBoModel.getEmail());
        AccountMessageAdmin response;
        if(fetch.isEmpty()){
            //No account is found
            response = new AccountMessageAdmin(false, "Sai tài khoản cán bộ");
        }
        else{
            if(fetch.get(0).getPassword().equals(canBoModel.getPassword())){
                response = new AccountMessageAdmin(true, "Đăng nhập thành công", fetch.get(0));
            }
            else{
                //Account found but wrong password
                response = new AccountMessageAdmin(false, "Sai mật khẩu cho cán bộ " + fetch.get(0).getEmail());
            }
        }
        return response;
    }
}
