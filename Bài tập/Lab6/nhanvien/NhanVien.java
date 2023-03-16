/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanvien;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class NhanVien {
    public String ten;
    public long luong;
    public int tinhluong;

    public NhanVien() {
    }

    
    public NhanVien(String ten) {
        this.ten = ten;
    }
    
        public String loainhanvien()
    {
        return ten;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }

    public void settinhluong(int tinhluong){
        this.tinhluong=tinhluong;
    }
    public int gettinhluong()
    {
        return tinhluong;   
    }
    public void Tinhluong()
    {
        this.tinhluong=(int) (luong*1);
    }

    public void Xuatthongtin()
    {
        System.out.println("Ten nhan vien:"+this.ten+" Luong:"+this.luong+" va Tinh luong:"+this.tinhluong);
    }
}
