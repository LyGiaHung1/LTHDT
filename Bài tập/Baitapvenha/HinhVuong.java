/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitapvenha;

/**
 *
 * @author Acer
 */
public class HinhVuong {
    double Canh;
    double S;
    double Chuvi;

    public double getCanh() {
        return Canh;
    }

    public void setCanh(double Canh) {
        this.Canh = Canh;
    }

    public double getS()
    {
        return S=(double)(Canh*4);
        
    }
    public void setS(double S)
    {
        this.S=S;
    }
    public double getChuvi()
    {
        return Chuvi=(double)(Canh*4);
    }
    public void setChuvi(double Chuvi)
    {
        this.Chuvi=Chuvi;
    }
}
