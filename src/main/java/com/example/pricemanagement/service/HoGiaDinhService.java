package com.example.pricemanagement.service;

import com.example.pricemanagement.repository.HoGiaDinhRepository;
import com.example.pricemanagement.repository.model.HoGiaDinhModel;
import com.example.pricemanagement.type.acountmessage.AccountMessageFamily;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class HoGiaDinhService {
    private final HoGiaDinhRepository hoGiaDinhRepository;

    public HoGiaDinhService(HoGiaDinhRepository hoGiaDinhRepository) {
        this.hoGiaDinhRepository = hoGiaDinhRepository;
    }

    public List<HoGiaDinhModel> getById(String id){
        return this.hoGiaDinhRepository.getById(id);
    }

    public AccountMessageFamily login(HoGiaDinhModel hoGiaDinhModel){
        List<HoGiaDinhModel> fetch = getById(hoGiaDinhModel.getIdSoHoKhau());
        AccountMessageFamily response;
        if(fetch.isEmpty()){
            //No account is found
            response = new AccountMessageFamily(false, "Sai mã số hộ gia đình");
        }
        else{
            if(fetch.get(0).getPassword().equals(hoGiaDinhModel.getPassword())){
                response = new AccountMessageFamily(true, "Đăng nhập thành công", fetch.get(0));
            }
            else{
                //Account found but wrong password
                response = new AccountMessageFamily(false, "Sai mật khẩu cho hộ gia đình " + fetch.get(0).getIdSoHoKhau());
            }
        }
        return response;
    }
}
