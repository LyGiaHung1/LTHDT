/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class PhongHoc {
    Scanner sc= new Scanner(System.in);
    String maphong,daynha;
    double dientich;
    int sobongden;

    public PhongHoc() {
    }

    public PhongHoc(String maphong, String daynha, double dientich, int sobongden) {
        this.maphong = maphong;
        this.daynha = daynha;
        this.dientich = dientich;
        this.sobongden = sobongden;
    }

    public String getMaphong() {
        return maphong;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    public String getDaynha() {
        return daynha;
    }

    public void setDaynha(String daynha) {
        this.daynha = daynha;
    }

    public double getDientich() {
        return dientich;
    }

    public void setDientich(double dientich) {
        this.dientich = dientich;
    }

    public int getSobongden() {
        return sobongden;
    }

    public void setSobongden(int sobongden) {
        this.sobongden = sobongden;
    }
    
}
