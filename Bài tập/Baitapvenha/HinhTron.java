/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitapvenha;

/**
 *
 * @author Acer
 */
public class HinhTron {
    double BanKinh;
    double DuongKinh;
    double Chuvi;
    double S;
    double  PI = Math.PI;
    public void setBanKinh(double BanKinh) {
        this.BanKinh = BanKinh;
    }
    public double getBanKinh() {
        return BanKinh=(double)(DuongKinh/2);
    }
    public double getDuongKinh() {
        return DuongKinh;
    }
    public void setDuongKinh(double DuongKinh) {
        this.DuongKinh =DuongKinh;
    }
    public double getChuvi()
    {
        return Chuvi=(double)(BanKinh*BanKinh*PI);
    }
    public void setChuvi(double Chuvi)
    {
        this.Chuvi=Chuvi;
    }
    public double getS()
    {
        return S=(double)(BanKinh*BanKinh*PI);
    }
    public void setS(double S)
    {
        this.S=S;
    }
            
}
