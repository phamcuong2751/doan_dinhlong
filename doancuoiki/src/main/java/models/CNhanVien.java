/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author ASUS
 */
public class CNhanVien {

    private String manv;
    private String hoten;
    private String diachi;
    private String gioitinh;
    private int luong;

    public CNhanVien() {
        this.manv = "";
        this.hoten = "";
        this.diachi = "";
        this.gioitinh = "";
        this.luong = 0;
    }

    public CNhanVien(String manv, String hoten, String diachi, String gioitinh, int luong) {
        this.manv = manv;
        this.hoten = hoten;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.luong = luong;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

}
