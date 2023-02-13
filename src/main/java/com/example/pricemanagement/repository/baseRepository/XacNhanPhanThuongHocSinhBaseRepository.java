package com.example.pricemanagement.repository.baseRepository;

import com.example.pricemanagement.repository.model.XacNhanPhanThuongHocSinhModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface XacNhanPhanThuongHocSinhBaseRepository extends JpaRepository<XacNhanPhanThuongHocSinhModel, Long> {
    @Query(value = "SELECT * FROM xacnhanphanthuonghocsinh WHERE id = :id", nativeQuery = true)
    public List<XacNhanPhanThuongHocSinhModel> findByFormId(Long id);

    @Query(value = "SELECT * FROM xacnhanphanthuonghocsinh xn INNER JOIN formdangky f " +
            "ON xn.id = f.id INNER JOIN hocsinh hs " +
            "ON f.ma_giay_khai_sinh = hs.ma_giay_khai_sinh INNER JOIN thanhvien tv " +
            "ON hs.ma_giay_khai_sinh = tv.ma_giay_khai_sinh INNER JOIN hogiadinh hgd " +
            "ON tv.id_so_ho_khau = hgd.id_so_ho_khau WHERE hgd.id_so_ho_khau = :idshk", nativeQuery = true)
    public List<XacNhanPhanThuongHocSinhModel> findByIdSHK(String idshk);
}
