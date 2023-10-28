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
public class TacGia {
    private String maTacGia;
    private String hoTen;
    private Date namSinh;
    private String queQuan;

    public TacGia() {
    }

    public TacGia(String maTacGia, String hoTen, Date namSinh, String queQuan) {
        this.maTacGia = maTacGia;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.queQuan = queQuan;
    }

    public String getMaTacGia() {
        return maTacGia;
    }

    public void setMaTacGia(String maTacGia) {
        this.maTacGia = maTacGia;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Date namSinh) {
        this.namSinh = namSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    
}
