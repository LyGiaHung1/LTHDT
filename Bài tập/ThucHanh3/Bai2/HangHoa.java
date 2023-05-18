/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
abstract class HangHoa {
    Scanner sc=new Scanner(System.in);
    String mahang,tenhang;
    double tonkho,gia;  
    String mucdoban;

    public HangHoa(String mahang, String tenhang, double tonkho, double gia) {
        this.mahang = mahang;
        this.tenhang = tenhang;
        this.tonkho = tonkho;
        this.gia = gia;
    }

    public String getMahang() {
        return mahang;
    }

    public void setMahang(String mahang) {
        this.mahang = mahang;
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public double getTonkho() {
        return tonkho;
    }

    public void setTonkho(double tonkho) {
        this.tonkho = tonkho;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getMucdoban() {
        return mucdoban;
    }

    public void setMucdoban(String mucdoban) {
        this.mucdoban = mucdoban;
    }
    abstract public int mucdoban();
    abstract public double VAT();
}
