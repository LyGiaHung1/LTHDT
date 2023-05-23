/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class KhachHang {
    Scanner sc=new Scanner(System.in);
    String makhachhang,hoten;
    LocalDate ngayhoadon = LocalDate.now();
    double soluong,dongia,thanhtien;

    public KhachHang() {
    }

    public KhachHang(String makhachhang, String hoten, LocalDate ngayhoadon, double soluong, double dongia) {
        this.makhachhang = makhachhang;
        this.hoten = hoten;
        this.ngayhoadon = ngayhoadon;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public LocalDate getNgayhoadon() {
        return ngayhoadon;
    }

    public void setNgayhoadon(LocalDate ngayhoadon) {
        this.ngayhoadon = ngayhoadon;
    }

    public double getSoluong() {
        return soluong;
    }

    public void setSoluong(double soluong) {
        this.soluong = soluong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }
     public String ngayhoadon()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        String ngay = dtf.format(ngayhoadon);
        return ngay;
    }
}
