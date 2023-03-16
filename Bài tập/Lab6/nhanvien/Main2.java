/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanvien;

/**
 *
 * @author Acer
 */
public class Main2 {
    public static void main(String[] args) {
        NhanVienFulltime nv1 = new NhanVienFulltime();
        NhanVienParttime nv2=new NhanVienParttime();
        nv1.Nhap();
        nv1.Tinhluong();
        nv1.Xuatthongtin();
        nv2.Nhap();
        nv2.Tinhluong();
        nv2.Xuatthongtin();
        
    }
}
