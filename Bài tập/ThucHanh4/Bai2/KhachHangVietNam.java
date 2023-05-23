/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.time.LocalDate;

/**
 *
 * @author Acer
 */
public class KhachHangVietNam extends KhachHang{
    String doituong;
    double dinhmuc;

    public KhachHangVietNam() { 
    }

    public KhachHangVietNam(String doituong, double dinhmuc, String makhachhang, String hoten, LocalDate ngayhoadon, double soluong, double dongia) {
        super(makhachhang, hoten, ngayhoadon, soluong, dongia);
        this.doituong = doituong;
        this.dinhmuc = dinhmuc;
    }

    public String getDoituong() {
        return doituong;
    }

    public void setDoituong(String doituong) {
        this.doituong = doituong;
    }

    public double getDinhmuc() {
        return dinhmuc;
    }

    public void setDinhmuc(double dinhmuc) {
        this.dinhmuc = dinhmuc;
    }
    
    public void Nhap()
    {
        System.out.print("Nhap ma khach hang:");
        makhachhang=sc.nextLine();
        System.out.print("Nhap ten khach hang:");
        hoten=sc.nextLine();
        System.out.print("Doi tuong khach hang:");
        doituong=sc.nextLine();
        System.out.print("So KW tieu thu:");
        soluong=sc.nextDouble();
        System.out.print("Nhap gia:");
        dongia=sc.nextDouble();
        System.out.print("Nhap dinh muc:");
        dinhmuc=sc.nextDouble();
    }
    public double thanhtien()
    {
        if(soluong <= dinhmuc)
        {
            thanhtien = soluong * dongia;
        }
        else
        {
            thanhtien = soluong * dongia * dinhmuc + (soluong-dinhmuc) * dongia *2.5;
        }
        return thanhtien;
    }
}
