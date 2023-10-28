/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author trand
 */
public class Sach {
    private String maSach;
    private String tenSach;
    private String namXuatBan;
    private String maLoai;
    private String maTacGia;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, String namXuatBan, String maLoai, String maTacGia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.namXuatBan = namXuatBan;
        this.maLoai = maLoai;
        this.maTacGia = maTacGia;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(String namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getMaTacGia() {
        return maTacGia;
    }

    public void setMaTacGia(String maTacGia) {
        this.maTacGia = maTacGia;
    }

  
    
}
