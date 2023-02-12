package com.example.pricemanagement.service;

import com.example.pricemanagement.repository.KeToanRepository;
import com.example.pricemanagement.repository.XacNhanPhanThuongHocSinhRepository;
import com.example.pricemanagement.repository.model.FormDangKyModel;
import com.example.pricemanagement.repository.model.KeToanModel;
import com.example.pricemanagement.repository.model.XacNhanPhanThuongHocSinhModel;
import com.example.pricemanagement.type.accountantconfirmationmessage.AccountantConfirmationMessage;
import com.example.pricemanagement.type.accountmessage.AccountMessageAccountant;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class KeToanService {
    private final KeToanRepository keToanRepository;
    private final FormDangKyService formDangKyService;
    private final XacNhanPhanThuongHocSinhRepository xacNhanPhanThuongHocSinhRepository;

    public KeToanService(KeToanRepository keToanRepository, FormDangKyService formDangKyService, XacNhanPhanThuongHocSinhRepository xacNhanPhanThuongHocSinhRepository) {
        this.keToanRepository = keToanRepository;
        this.formDangKyService = formDangKyService;
        this.xacNhanPhanThuongHocSinhRepository = xacNhanPhanThuongHocSinhRepository;
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

    public String confirmStudentForm(AccountantConfirmationMessage accountantConfirmationMessage){
        List<FormDangKyModel> formDangKyModels = this.formDangKyService.getAcceptedFormByYear(accountantConfirmationMessage.getYear());
        if(formDangKyModels.isEmpty()){
            return "Không có form nào trong năm " + accountantConfirmationMessage.getYear();
        }
        else if (accountantConfirmationMessage.isConfirm()){
            for(int i=0; i<formDangKyModels.size(); i++){
                List<XacNhanPhanThuongHocSinhModel> xacNhanPhanThuongHocSinhModels = this.xacNhanPhanThuongHocSinhRepository.findByFormId(formDangKyModels.get(i).getId());
                if(xacNhanPhanThuongHocSinhModels.isEmpty()){
                    System.out.println(accountantConfirmationMessage.getKeToan().getEmail());
                    XacNhanPhanThuongHocSinhModel temp = new XacNhanPhanThuongHocSinhModel(formDangKyModels.get(i),
                            formDangKyModels.get(i).getDanhHieu().getPhanThuongHocSinhGioi(),
                            accountantConfirmationMessage.getKeToan(), "Xác nhận");
                    temp.setId(formDangKyModels.get(i).getId());
                    this.xacNhanPhanThuongHocSinhRepository.saveXacNhanPhanThuongHocSinh(temp);
                }
                else{
                    XacNhanPhanThuongHocSinhModel temp = xacNhanPhanThuongHocSinhModels.get(0);
                    temp.setTrangThai("Xác nhận");
                    this.xacNhanPhanThuongHocSinhRepository.saveXacNhanPhanThuongHocSinh(temp);
                }
            }
            return "Xác nhận thành công những form trong năm " + accountantConfirmationMessage.getYear();
        }
        else{
            for(int i=0; i<formDangKyModels.size(); i++){
                List<XacNhanPhanThuongHocSinhModel> xacNhanPhanThuongHocSinhModels = this.xacNhanPhanThuongHocSinhRepository.findByFormId(formDangKyModels.get(i).getId());
                if(xacNhanPhanThuongHocSinhModels.isEmpty()){
                    XacNhanPhanThuongHocSinhModel temp = new XacNhanPhanThuongHocSinhModel(formDangKyModels.get(i),
                            formDangKyModels.get(i).getDanhHieu().getPhanThuongHocSinhGioi(),
                            accountantConfirmationMessage.getKeToan(), "Từ chối");
                    temp.setId(formDangKyModels.get(i).getId());
                    this.xacNhanPhanThuongHocSinhRepository.saveXacNhanPhanThuongHocSinh(temp);
                }
                else{
                    XacNhanPhanThuongHocSinhModel temp = xacNhanPhanThuongHocSinhModels.get(0);
                    temp.setTrangThai("Từ chối");
                    this.xacNhanPhanThuongHocSinhRepository.saveXacNhanPhanThuongHocSinh(temp);
                }
            }
            return "Từ chối thành công những form trong năm " + accountantConfirmationMessage.getYear();
        }
    }
}
