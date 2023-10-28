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
    private Date namXuatBan;
    private boolean trangThai;
    private String maLoaiSach;
    private String maTacGia;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, Date namXuatBan, boolean trangThai, String maLoaiSach, String maTacGia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.namXuatBan = namXuatBan;
        this.trangThai = trangThai;
        this.maLoaiSach = maLoaiSach;
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

    public Date getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(Date namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getMaLoaiSach() {
        return maLoaiSach;
    }

    public void setMaLoaiSach(String maLoaiSach) {
        this.maLoaiSach = maLoaiSach;
    }

    public String getMaTacGia() {
        return maTacGia;
    }

    public void setMaTacGia(String maTacGia) {
        this.maTacGia = maTacGia;
    }
    
}
