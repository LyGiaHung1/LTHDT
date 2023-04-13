
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class SanPham {
    Scanner sc=new Scanner(System.in);
    private String Ten;
    private double Gia,GiamGia;

    public SanPham() {
    }

    public SanPham(String Ten, double Gia, double GiamGia) {
        this.Ten = Ten;
        this.Gia = Gia;
        this.GiamGia = GiamGia;
    }

    public SanPham(String Ten, double Gia) {
        this.Ten = Ten;
        this.Gia = Gia;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }

    public double getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(double GiamGia) {
        this.GiamGia = GiamGia;
    }
    public double thuenhapkhau()
    {
        double thue=(Gia*10)/100;
        return thue;
    }

    @Override
    public String toString() {
        return "Ten=" + Ten + ", Gia=" + Gia + ", GiamGia=" + GiamGia + "Thue="+thuenhapkhau();
    }
    public void nhap()
    {
        System.out.print("Nhap ten sp:");
        Ten=sc.nextLine();
        System.out.print("Nhap Gia:");
        Gia=sc.nextDouble();
        System.out.print("Nhap Gia da giam:");
        GiamGia=sc.nextDouble();
    }
    public void xuat()
    {
        System.out.println("San pham gom:"+toString());
    }
}
