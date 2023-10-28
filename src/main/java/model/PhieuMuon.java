/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author trand
 */
public class PhieuMuon {
    private String maPhieuMuon;
    private String ThuThu;
    private String maHocSinh;

    public PhieuMuon() {
    }

    public PhieuMuon(String maPhieuMuon, String ThuThu, String maHocSinh) {
        this.maPhieuMuon = maPhieuMuon;
        this.ThuThu = ThuThu;
        this.maHocSinh = maHocSinh;
    }

    public String getMaPhieuMuon() {
        return maPhieuMuon;
    }

    public void setMaPhieuMuon(String maPhieuMuon) {
        this.maPhieuMuon = maPhieuMuon;
    }

    public String getThuThu() {
        return ThuThu;
    }

    public void setThuThu(String ThuThu) {
        this.ThuThu = ThuThu;
    }

    public String getMaHocSinh() {
        return maHocSinh;
    }

    public void setMaHocSinh(String maHocSinh) {
        this.maHocSinh = maHocSinh;
    }
    
}
