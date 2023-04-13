/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Main1 {
    public static void main(String[] args) {
        SanPham sp1=new SanPham();
        sp1.nhap();
        sp1.xuat();
        SanPham sp2=new SanPham();
        sp2.nhap();
        sp2.xuat();
        SanPham sp3=new SanPham("Keo mikita", 600);
        sp3.xuat();
        SanPham sp4=new SanPham("Banh socola", 3000, 2500);
        sp4.xuat();
    }
}
