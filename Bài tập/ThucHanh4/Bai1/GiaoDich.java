/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class GiaoDich {
        Scanner sc=new Scanner (System.in);
        int magiaodich;
        LocalDate ngaygiaodich = LocalDate.now();
        double dongia,dientich;
        double thanhtien;

    public GiaoDich() {
    }
    public GiaoDich(int magiaodich, LocalDate ngaygiaodich, double dongia, double dientich) {
        this.magiaodich = magiaodich;
        this.ngaygiaodich = ngaygiaodich;
        this.dongia = dongia;
        this.dientich = dientich;
    }

    public int getMagiaodich() {
        return magiaodich;
    }

    public void setMagiaodich(int magiaodich) {
        this.magiaodich = magiaodich;
    }

    public LocalDate getNgaygiaodich() {
        return ngaygiaodich;
    }

    public void setNgaygiaodich(LocalDate ngaygiaodich) {
        this.ngaygiaodich = ngaygiaodich;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getDientich() {
        return dientich;
    }

    public void setDientich(double dientich) {
        this.dientich = dientich;
    }

    public String ngaygiaodich()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        String ngay = dtf.format(ngaygiaodich);
        return ngay;
    }
        
    
//    public double thanhtien()
//    {
//        return thanhtien;
//    }
}
