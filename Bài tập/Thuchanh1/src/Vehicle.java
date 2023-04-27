
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Vehicle {
    String Hang,Ten;
    double dungtich,Gia,Thue;

    public Vehicle() {
    }

    public Vehicle(String Hang, String Ten, double dungtich, double Gia) {
        this.Hang = Hang;
        this.Ten = Ten;
        this.dungtich = dungtich;
        this.Gia = Gia;
    }

    public String getHang() {
        return Hang;
    }

    public void setHang(String Hang) {
        this.Hang = Hang;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public double getDungtich() {
        return dungtich;
    }

    public void setDungtich(double dungtich) {
        this.dungtich = dungtich;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }

    public double getThue() {
        return Thue;
    }

    public void setThue(double Thue) {
        this.Thue = Thue;
    }
    
    public double thue()
    {
        if(dungtich < 100)
        this.Thue=this.Gia * 0.1;
        else if(dungtich >=100 && dungtich<=200)
        this.Thue=this.Gia * 0.3;
        else if(dungtich >200)
        this.Thue=this.Gia * 0.5;
        return Thue;
    }
    public void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ten chu xe:");
        Ten=sc.nextLine();
        System.out.print("Nhap loai xe:");
        Hang=sc.nextLine();
        System.out.print("Nhap dung tich xe:");
        dungtich=sc.nextDouble();
        System.out.print("Nhap gia xe:");
        Gia=sc.nextDouble();
    }
//    public void Xuat()
//    {
//        DecimalFormat df=new DecimalFormat("#,##0.00");
//        System.out.format("%-30s"+this.Ten);
//        System.out.format("%-30s"+this.Hang);
//        System.out.format("%30s"+this.dungtich);
//        System.out.format("%30.2f"+this.Gia);
//        System.out.format("%30.2f"+this.Thue);
//    }

    
    
}
