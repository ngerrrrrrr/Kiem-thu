package com.example.demo4;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class QuanLySinhVien {
    private List<SinhVien> list = new ArrayList<>();

    public void them(SinhVien sv) {
        if (sv == null) {
            throw new IllegalArgumentException("Sinh viên không được null!");
        }
        list.add(sv);
    }

    public SinhVien update(String maSv, String tenNew, int tuoiNew, float diemNew, int kyNew, String nganhNew) {
        for (SinhVien sv : list) {
            if (sv.ma.equals(maSv)) {
                sv.ten = tenNew;
                sv.tuoi = tuoiNew;
                sv.diemTb = diemNew;
                sv.kyHoc = kyNew;
                sv.chuyenNganh = nganhNew;
                return sv;
            }
        }
        throw new NoSuchElementException("Không tìm thấy sinh viên");
    }

    public boolean delete(String maSv) {
        if (maSv == null || maSv.isEmpty()) {
            throw new IllegalArgumentException("Mã sinh viên không hợp lệ");
        }
        return list.removeIf(sv -> sv.ma.equals(maSv));
    }

    public SinhVien timKiem(String maSv){
        return list.stream().filter(sv -> sv.ma.equals(maSv)).findFirst().orElse(null);
    }
}
