package com.example.pricemanagement.service;

import com.example.pricemanagement.repository.KeToanRepository;
import com.example.pricemanagement.repository.model.CanBoModel;
import com.example.pricemanagement.repository.model.KeToanModel;
import com.example.pricemanagement.type.acountmessage.AccountMessageAccountant;
import com.example.pricemanagement.type.acountmessage.AccountMessageAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class KeToanService {
    private final KeToanRepository keToanRepository;

    public KeToanService(KeToanRepository keToanRepository) {
        this.keToanRepository = keToanRepository;
    }

    public List<KeToanModel> getKeToanByEmail(String email){
        return this.keToanRepository.getKeToanByEmail(email);
    }

    public AccountMessageAccountant login(KeToanModel keToanModel){
        List<KeToanModel> fetch = getKeToanByEmail(keToanModel.getEmail());
        AccountMessageAccountant response;
        if(fetch.isEmpty()){
            //No account is found
            response = new AccountMessageAccountant(false, "Sai tài khoản kế toán");
        }
        else{
            if(fetch.get(0).getPassword().equals(keToanModel.getPassword())){
                response = new AccountMessageAccountant(true, "Đăng nhập thành công", fetch.get(0));
            }
            else{
                //Account found but wrong password
                response = new AccountMessageAccountant(false, "Sai mật khẩu cho kế toán " + fetch.get(0).getEmail());
            }
        }
        return response;
    }
}
