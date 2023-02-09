package com.example.pricemanagement.repository.baseRepository;

import com.example.pricemanagement.repository.model.FormDangKyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface FormDangKyBaseRepository extends JpaRepository<FormDangKyModel, Long>{
    @Query(value = "SELECT * FROM formdangky f INNER JOIN hocsinh hs ON f.ma_giay_khai_sinh = hs.ma_giay_khai_sinh WHERE f.trang_thai = 'Xác nhận'", nativeQuery = true)
    List<FormDangKyModel>  getAcceptedForm();

    @Query(value = "SELECT * FROM formdangky f INNER JOIN hocsinh hs ON f.ma_giay_khai_sinh = hs.ma_giay_khai_sinh WHERE f.trang_thai = :status", nativeQuery = true)
    List<FormDangKyModel>  getFormByStatus(String status);

    @Query(value = "SELECT * FROM formdangky f INNER JOIN hocsinh hs " +
            "ON f.ma_giay_khai_sinh = hs.ma_giay_khai_sinh INNER JOIN thanhvien tv " +
            "ON hs.ma_giay_khai_sinh = tv.ma_giay_khai_sinh INNER JOIN hogiadinh hgd " +
            "ON tv.id_so_ho_khau = hgd.id_so_ho_khau WHERE tv.nam_sinh = :year", nativeQuery = true)
    List<FormDangKyModel>  getFormByBirthYear(int year);

    @Query(value = "SELECT * FROM formdangky f INNER JOIN hocsinh hs " +
            "ON f.ma_giay_khai_sinh = hs.ma_giay_khai_sinh INNER JOIN thanhvien tv " +
            "ON hs.ma_giay_khai_sinh = tv.ma_giay_khai_sinh INNER JOIN hogiadinh hgd " +
            "ON tv.id_so_ho_khau = hgd.id_so_ho_khau WHERE tv.ten LIKE %?1%", nativeQuery = true)
    List<FormDangKyModel>  getFormByName(String name);

    @Query(value = "SELECT * FROM formdangky f INNER JOIN hocsinh hs " +
            "ON f.ma_giay_khai_sinh = hs.ma_giay_khai_sinh INNER JOIN thanhvien tv " +
            "ON hs.ma_giay_khai_sinh = tv.ma_giay_khai_sinh INNER JOIN hogiadinh hgd " +
            "ON tv.id_so_ho_khau = hgd.id_so_ho_khau WHERE hgd.id_so_ho_khau LIKE ?1%", nativeQuery = true)
    List<FormDangKyModel>  getFormByIDSHK(String id_shk);

    @Query(value = "SELECT * FROM formdangky f INNER JOIN hocsinh hs " +
            "ON f.ma_giay_khai_sinh = hs.ma_giay_khai_sinh INNER JOIN thanhvien tv " +
            "ON hs.ma_giay_khai_sinh = tv.ma_giay_khai_sinh INNER JOIN hogiadinh hgd " +
            "ON tv.id_so_ho_khau = hgd.id_so_ho_khau ORDER BY reverse(split_part(reverse(ten), ' ', 1)) asc, " +
            "reverse(split_part(reverse(ten), ' ', 2)) asc, reverse(split_part(reverse(ten), ' ', 3)) asc", nativeQuery = true)
    List<FormDangKyModel> getFormSortByNameAsc();

    @Query(value = "SELECT * FROM formdangky f INNER JOIN hocsinh hs " +
            "ON f.ma_giay_khai_sinh = hs.ma_giay_khai_sinh INNER JOIN thanhvien tv " +
            "ON hs.ma_giay_khai_sinh = tv.ma_giay_khai_sinh INNER JOIN hogiadinh hgd " +
            "ON tv.id_so_ho_khau = hgd.id_so_ho_khau ORDER BY reverse(split_part(reverse(ten), ' ', 1)) desc, " +
            "reverse(split_part(reverse(ten), ' ', 2)) desc, reverse(split_part(reverse(ten), ' ', 3)) desc", nativeQuery = true)
    List<FormDangKyModel> getFormSortByNameDesc();

    @Query(value = "SELECT * FROM formdangky f INNER JOIN hocsinh hs " +
            "ON f.ma_giay_khai_sinh = hs.ma_giay_khai_sinh INNER JOIN thanhvien tv " +
            "ON hs.ma_giay_khai_sinh = tv.ma_giay_khai_sinh INNER JOIN hogiadinh hgd " +
            "ON tv.id_so_ho_khau = hgd.id_so_ho_khau ORDER BY nam_sinh asc", nativeQuery = true)
    List<FormDangKyModel> getFormSortByYearAsc();

    @Query(value = "SELECT * FROM formdangky f INNER JOIN hocsinh hs " +
            "ON f.ma_giay_khai_sinh = hs.ma_giay_khai_sinh INNER JOIN thanhvien tv " +
            "ON hs.ma_giay_khai_sinh = tv.ma_giay_khai_sinh INNER JOIN hogiadinh hgd " +
            "ON tv.id_so_ho_khau = hgd.id_so_ho_khau ORDER BY nam_sinh desc", nativeQuery = true)
    List<FormDangKyModel> getFormSortByYearDesc();

    @Query(value = "SELECT * FROM formdangky f INNER JOIN hocsinh hs " +
            "ON f.ma_giay_khai_sinh = hs.ma_giay_khai_sinh INNER JOIN thanhvien tv " +
            "ON hs.ma_giay_khai_sinh = tv.ma_giay_khai_sinh INNER JOIN hogiadinh hgd " +
            "ON tv.id_so_ho_khau = hgd.id_so_ho_khau ORDER BY hgd.id_so_ho_khau asc", nativeQuery = true)
    List<FormDangKyModel> getFormSortByIDSHKAsc();

    @Query(value = "SELECT * FROM formdangky f INNER JOIN hocsinh hs " +
            "ON f.ma_giay_khai_sinh = hs.ma_giay_khai_sinh INNER JOIN thanhvien tv " +
            "ON hs.ma_giay_khai_sinh = tv.ma_giay_khai_sinh INNER JOIN hogiadinh hgd " +
            "ON tv.id_so_ho_khau = hgd.id_so_ho_khau ORDER BY hgd.id_so_ho_khau desc", nativeQuery = true)
    List<FormDangKyModel> getFormSortByIDSHKDesc();

    @Query(value = "SELECT * FROM formdangky f INNER JOIN hocsinh hs " +
            "ON f.ma_giay_khai_sinh = hs.ma_giay_khai_sinh INNER JOIN thanhvien tv " +
            "ON hs.ma_giay_khai_sinh = tv.ma_giay_khai_sinh INNER JOIN hogiadinh hgd " +
            "ON tv.id_so_ho_khau = hgd.id_so_ho_khau ORDER BY trang_thai asc", nativeQuery = true)
    List<FormDangKyModel> getFormSortByStateAsc();

    @Query(value = "SELECT * FROM formdangky f INNER JOIN hocsinh hs " +
            "ON f.ma_giay_khai_sinh = hs.ma_giay_khai_sinh INNER JOIN thanhvien tv " +
            "ON hs.ma_giay_khai_sinh = tv.ma_giay_khai_sinh INNER JOIN hogiadinh hgd " +
            "ON tv.id_so_ho_khau = hgd.id_so_ho_khau ORDER BY trang_thai desc", nativeQuery = true)
    List<FormDangKyModel> getFormSortByStateDesc();

    @Query(value = "SELECT * FROM formdangky f INNER JOIN hocsinh hs " +
            "ON f.ma_giay_khai_sinh = hs.ma_giay_khai_sinh INNER JOIN thanhvien tv " +
            "ON hs.ma_giay_khai_sinh = tv.ma_giay_khai_sinh INNER JOIN hogiadinh hgd " +
            "ON tv.id_so_ho_khau = hgd.id_so_ho_khau WHERE tv.nam_sinh = :year AND f.trang_thai = 'Xác nhận'", nativeQuery = true)
    List<FormDangKyModel>  getAcceptedFormByBirthYear(int year);

    @Query(value = "SELECT * FROM formdangky f INNER JOIN hocsinh hs " +
            "ON f.ma_giay_khai_sinh = hs.ma_giay_khai_sinh INNER JOIN thanhvien tv " +
            "ON hs.ma_giay_khai_sinh = tv.ma_giay_khai_sinh INNER JOIN hogiadinh hgd " +
            "ON tv.id_so_ho_khau = hgd.id_so_ho_khau WHERE tv.ten LIKE %?1% AND f.trang_thai = 'Xác nhận'", nativeQuery = true)
    List<FormDangKyModel>  getAcceptedFormByName(String name);

    @Query(value = "SELECT * FROM formdangky f INNER JOIN hocsinh hs " +
            "ON f.ma_giay_khai_sinh = hs.ma_giay_khai_sinh INNER JOIN thanhvien tv " +
            "ON hs.ma_giay_khai_sinh = tv.ma_giay_khai_sinh INNER JOIN hogiadinh hgd " +
            "ON tv.id_so_ho_khau = hgd.id_so_ho_khau WHERE hgd.id_so_ho_khau LIKE ?1% AND f.trang_thai = 'Xác nhận'", nativeQuery = true)
    List<FormDangKyModel>  getAcceptedFormByIDSHK(String id_shk);

    @Query(value = "SELECT * FROM formdangky f INNER JOIN canbo cb " +
            "ON f.email = cb.email WHERE cb.ten = :ten AND f.trang_thai = 'Xác nhận'", nativeQuery = true)
    List<FormDangKyModel> getAcceptedFormByAdmin(String ten);

    @Query(value = "SELECT * FROM formdangky f INNER JOIN danhhieu dh " +
            "ON f.id_danh_hieu = dh.id_danh_hieu WHERE dh.ten_danh_hieu = :name AND f.trang_thai = 'Xác nhận'", nativeQuery = true)
    List<FormDangKyModel> getAcceptedFormByTitle(String name);

    @Query(value = "SELECT * FROM formdangky f INNER JOIN hocsinh hs " +
            "ON f.ma_giay_khai_sinh = hs.ma_giay_khai_sinh INNER JOIN thanhvien tv " +
            "ON hs.ma_giay_khai_sinh = tv.ma_giay_khai_sinh INNER JOIN hogiadinh hgd " +
            "ON tv.id_so_ho_khau = hgd.id_so_ho_khau WHERE f.trang_thai = 'Xác nhận' ORDER BY reverse(split_part(reverse(ten), ' ', 1)) asc, " +
            "reverse(split_part(reverse(ten), ' ', 2)) asc, reverse(split_part(reverse(ten), ' ', 3)) asc", nativeQuery = true)
    List<FormDangKyModel> getAcceptedFormSortByNameAsc();

    @Query(value = "SELECT * FROM formdangky f INNER JOIN hocsinh hs " +
            "ON f.ma_giay_khai_sinh = hs.ma_giay_khai_sinh INNER JOIN thanhvien tv " +
            "ON hs.ma_giay_khai_sinh = tv.ma_giay_khai_sinh INNER JOIN hogiadinh hgd " +
            "ON tv.id_so_ho_khau = hgd.id_so_ho_khau WHERE f.trang_thai = 'Xác nhận' ORDER BY reverse(split_part(reverse(ten), ' ', 1)) desc, " +
            "reverse(split_part(reverse(ten), ' ', 2)) desc, reverse(split_part(reverse(ten), ' ', 3)) desc", nativeQuery = true)
    List<FormDangKyModel> getAcceptedFormSortByNameDesc();

    @Query(value = "SELECT * FROM formdangky f INNER JOIN hocsinh hs " +
            "ON f.ma_giay_khai_sinh = hs.ma_giay_khai_sinh INNER JOIN thanhvien tv " +
            "ON hs.ma_giay_khai_sinh = tv.ma_giay_khai_sinh INNER JOIN hogiadinh hgd " +
            "ON tv.id_so_ho_khau = hgd.id_so_ho_khau WHERE f.trang_thai = 'Xác nhận' ORDER BY nam_sinh asc", nativeQuery = true)
    List<FormDangKyModel> getAcceptedFormSortByYearAsc();

    @Query(value = "SELECT * FROM formdangky f INNER JOIN hocsinh hs " +
            "ON f.ma_giay_khai_sinh = hs.ma_giay_khai_sinh INNER JOIN thanhvien tv " +
            "ON hs.ma_giay_khai_sinh = tv.ma_giay_khai_sinh INNER JOIN hogiadinh hgd " +
            "ON tv.id_so_ho_khau = hgd.id_so_ho_khau WHERE f.trang_thai = 'Xác nhận' ORDER BY nam_sinh desc", nativeQuery = true)
    List<FormDangKyModel> getAcceptedFormSortByYearDesc();

    @Query(value = "SELECT * FROM formdangky f INNER JOIN hocsinh hs " +
            "ON f.ma_giay_khai_sinh = hs.ma_giay_khai_sinh INNER JOIN thanhvien tv " +
            "ON hs.ma_giay_khai_sinh = tv.ma_giay_khai_sinh INNER JOIN hogiadinh hgd " +
            "ON tv.id_so_ho_khau = hgd.id_so_ho_khau WHERE f.trang_thai = 'Xác nhận' ORDER BY hgd.id_so_ho_khau asc", nativeQuery = true)
    List<FormDangKyModel> getAcceptedFormSortByIDSHKAsc();

    @Query(value = "SELECT * FROM formdangky f INNER JOIN hocsinh hs " +
            "ON f.ma_giay_khai_sinh = hs.ma_giay_khai_sinh INNER JOIN thanhvien tv " +
            "ON hs.ma_giay_khai_sinh = tv.ma_giay_khai_sinh INNER JOIN hogiadinh hgd " +
            "ON tv.id_so_ho_khau = hgd.id_so_ho_khau WHERE f.trang_thai = 'Xác nhận' ORDER BY hgd.id_so_ho_khau desc", nativeQuery = true)
    List<FormDangKyModel> getAcceptedFormSortByIDSHKDesc();

    @Query(value = "SELECT * FROM formdangky f INNER JOIN danhhieu dh " +
            "ON f.id_danh_hieu = dh.id_danh_hieu WHERE f.trang_thai = 'Xác nhận' " +
            "ORDER BY ten_danh_hieu asc", nativeQuery = true)
    List<FormDangKyModel> getAcceptedFormSortByTitleAsc();

    @Query(value = "SELECT * FROM formdangky f INNER JOIN danhhieu dh " +
            "ON f.id_danh_hieu = dh.id_danh_hieu WHERE f.trang_thai = 'Xác nhận' " +
            "ORDER BY ten_danh_hieu desc", nativeQuery = true)
    List<FormDangKyModel> getAcceptedFormSortByTitleDesc();

    @Query(value = "SELECT * FROM formdangky f INNER JOIN canbo cb " +
            "ON f.email = cb.email WHERE f.trang_thai = 'Xác nhận' " +
            "ORDER BY reverse(split_part(reverse(ten_can_bo), ' ', 1)) asc, reverse(split_part(reverse(ten_can_bo), ' ', 2)) asc, " +
            "reverse(split_part(reverse(ten_can_bo), ' ', 3)) asc", nativeQuery = true)
    List<FormDangKyModel> getAcceptedFormSortByAdminAsc();

    @Query(value = "SELECT * FROM formdangky f INNER JOIN canbo cb " +
            "ON f.email = cb.email WHERE f.trang_thai = 'Xác nhận' " +
            "ORDER BY reverse(split_part(reverse(ten_can_bo), ' ', 1)) desc, reverse(split_part(reverse(ten_can_bo), ' ', 2)) desc, " +
            "reverse(split_part(reverse(ten_can_bo), ' ', 3)) desc", nativeQuery = true)
    List<FormDangKyModel> getAcceptedFormSortByAdminDesc();

    @Query(value = "SELECT * FROM formdangky f INNER JOIN danhhieu dh " +
            "ON f.id_danh_hieu = dh.id_danh_hieu INNER JOIN phanthuonghocsinhgioi pthsg " +
            "ON dh.id_phan_thuong_hoc_sinh = pthsg.id_phan_thuong_hoc_sinh WHERE f.trang_thai = 'Xác nhận' " +
            "ORDER BY ten_phan_thuong asc", nativeQuery = true)
    List<FormDangKyModel> getAcceptedFormSortByPrizeAsc();

    @Query(value = "SELECT * FROM formdangky f INNER JOIN danhhieu dh " +
            "ON f.id_danh_hieu = dh.id_danh_hieu INNER JOIN phanthuonghocsinhgioi pthsg " +
            "ON dh.id_phan_thuong_hoc_sinh = pthsg.id_phan_thuong_hoc_sinh WHERE f.trang_thai = 'Xác nhận' " +
            "ORDER BY ten_phan_thuong desc", nativeQuery = true)
    List<FormDangKyModel> getAcceptedFormSortByPrizeDesc();

    @Query(value = "SELECT * FROM formdangky f WHERE f.nam = :year AND f.trang_thai = 'Xác nhận'", nativeQuery = true)
    List<FormDangKyModel>  getAcceptedFormByYear(int year);
}
