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
public class KhachHangNuocNgoai extends KhachHang{
    String quoctich;

    public KhachHangNuocNgoai() {
    }

    public KhachHangNuocNgoai(String quoctich, String makhachhang, String hoten, LocalDate ngayhoadon, double soluong, double dongia) {
        super(makhachhang, hoten, ngayhoadon, soluong, dongia);
        this.quoctich = quoctich;
    }

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }
    public void Nhap()
    {
        System.out.print("Nhap ma khach hang:");
        makhachhang=sc.next();
        System.out.print("Nhap ten khach hang:");
        hoten=sc.next();
        System.out.print("Quoc tich khach hang:");
        quoctich=sc.next();
        System.out.print("So KW tieu thu:");
        soluong=sc.nextDouble();
        System.out.print("Nhap gia:");
        dongia=sc.nextDouble();
    }
    public double thanhtien()
    {
        return soluong * dongia;
    }
}
