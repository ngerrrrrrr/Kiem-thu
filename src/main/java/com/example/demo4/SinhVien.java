package com.example.demo4;

public class SinhVien {
    String ma;
    String ten;
    int tuoi;
    float diemTb;
    int kyHoc;
    String chuyenNganh;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public float getDiemTb() {
        return diemTb;
    }

    public void setDiemTb(float diemTb) {
        this.diemTb = diemTb;
    }

    public int getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(int kyHoc) {
        this.kyHoc = kyHoc;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public SinhVien(String ma, String ten, int tuoi, float diemTb, int kyHoc, String chuyenNganh) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diemTb = diemTb;
        this.kyHoc = kyHoc;
        this.chuyenNganh = chuyenNganh;
    }

    public SinhVien() {
    }
}
