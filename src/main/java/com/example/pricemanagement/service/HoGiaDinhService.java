package com.example.pricemanagement.service;

import com.example.pricemanagement.repository.HoGiaDinhRepository;
import com.example.pricemanagement.repository.XacNhanPhanThuongHocSinhRepository;
import com.example.pricemanagement.repository.model.HoGiaDinhModel;
import com.example.pricemanagement.repository.model.ThanhVienModel;
import com.example.pricemanagement.repository.model.XacNhanPhanThuongHocSinhModel;
import com.example.pricemanagement.type.accountmessage.AccountMessageFamily;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class HoGiaDinhService {
    private final HoGiaDinhRepository hoGiaDinhRepository;
    private final ThanhVienService thanhVienService;
    private final XacNhanPhanThuongHocSinhRepository xacNhanPhanThuongHocSinhRepository;

    public HoGiaDinhService(HoGiaDinhRepository hoGiaDinhRepository, ThanhVienService thanhVienService, XacNhanPhanThuongHocSinhRepository xacNhanPhanThuongHocSinhRepository) {
        this.hoGiaDinhRepository = hoGiaDinhRepository;
        this.thanhVienService = thanhVienService;
        this.xacNhanPhanThuongHocSinhRepository = xacNhanPhanThuongHocSinhRepository;
    }

    public List<HoGiaDinhModel> getHoGiaDinh(){
        return this.hoGiaDinhRepository.getHoGiaDinh();
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

    public String addHoGiaDinh(HoGiaDinhModel hoGiaDinhModel){
        this.hoGiaDinhRepository.addHoGiaDinh(hoGiaDinhModel);
        return "Thêm thành công hộ gia đình " + hoGiaDinhModel.getIdSoHoKhau();
    }

    public String deleteHoGiaDinh(HoGiaDinhModel hoGiaDinhModel){
        List<ThanhVienModel> temp = this.thanhVienService.getThanhVienByIdSoHoKhau(hoGiaDinhModel.getIdSoHoKhau());
        for (ThanhVienModel thanhVienModel : temp) {
            this.thanhVienService.deleteThanhVien(thanhVienModel);
        }
        this.hoGiaDinhRepository.deleteHoGiaDinh(hoGiaDinhModel);
        return "Xóa thành công hộ gia đình " + hoGiaDinhModel.getIdSoHoKhau();
    }

    public List<String> getMessage(String idshk){
        List<XacNhanPhanThuongHocSinhModel> temp = this.xacNhanPhanThuongHocSinhRepository.findByIdSHK(idshk);
        if(temp.size()==0){
            return null;
        }
        else{
            List<String> response = new ArrayList<>();
            for(XacNhanPhanThuongHocSinhModel p : temp){
                String message = "Phường đã xác nhận phần thưởng khuyến khích học tập cho cháu " + p.getFormDangKy().getHocSinh().getThanhVien().getTen()
                        + " với danh hiệu " + p.getFormDangKy().getDanhHieu().getTenDanhHieu() + " với phần thưởng " + p.getPhanThuongHocSinhGioi().getTenPhanThuong();
                response.add(message);
            }
            return response;
        }
    }
}
