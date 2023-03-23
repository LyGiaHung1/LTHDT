/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class GiaoDich {
    public String MaGD,NgayGD;
    public double soluong,dongia;

    public GiaoDich() {
    }

    public GiaoDich(String MaGD, String NgayGD, float soluong, double dongia) {
        this.MaGD = MaGD;
        this.NgayGD = NgayGD;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public String getMaGD() {
        return MaGD;
    }

    public void setMaGD(String MaGD) {
        this.MaGD = MaGD;
    }

    public String getNgayGD() {
        return NgayGD;
    }

    public void setNgayGD(String NgayGD) {
        this.NgayGD = NgayGD;
    }

    public double getSoluong() {
        return soluong;
    }

    public void setSoluong(float soluong) {
        this.soluong = soluong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }
    public void Thanhtien()
    {   
        System.out.println("Thanh tien:");
     
    }
}
