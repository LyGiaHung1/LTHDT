/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class HoaQua {
    public String  color,Nguongoc;
    public double Gia,Soluong;
    public int Ngaynhap;

    public HoaQua() {
    }

  

    public HoaQua(String color, String Nguongoc, double Gia, double Soluong, int Ngaynhap) {
        this.color = color;
        this.Nguongoc = Nguongoc;
        this.Gia = Gia;
        this.Soluong = Soluong;
        this.Ngaynhap = Ngaynhap;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNguongoc() {
        return Nguongoc;
    }

    public void setNguongoc(String Nguongoc) {
        this.Nguongoc = Nguongoc;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }

    public double getSoluong() {
        return Soluong;
    }

    public void setSoluong(double Soluong) {
        this.Soluong = Soluong;
    }

    public int getNgaynhap() {
        return Ngaynhap;
    }

    public void setNgaynhap(int Ngaynhap) {
        this.Ngaynhap = Ngaynhap;
    }
    public void An()
    {
        System.out.println("An duoc");
    }
    public void Uong()
    {
        System.out.println("Uong duoc");
    }
}
