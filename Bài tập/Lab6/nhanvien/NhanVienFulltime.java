/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanvien;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class NhanVienFulltime extends NhanVien{
    public int loaichucvu;
    public int ngaylamthem;

    public NhanVienFulltime() {
    }

    public NhanVienFulltime(int loaichucvu, int ngaylamthem, String ten) {
        super(ten);
        this.loaichucvu = loaichucvu;
        this.ngaylamthem = ngaylamthem;
    }
    
        public void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap vao ten nhan vien:");
        ten=sc.nextLine();
        System.out.print("Nhap vao luong nhan vien:");
        luong=sc.nextLong();
        System.out.print("Nhap vao loai chuc vu tuong ung voi so:");
        loaichucvu=sc.nextInt();
        System.out.print("Nhap vao ngay lam them:");
        ngaylamthem=sc.nextInt();
    }
    
    @Override
    public String loainhanvien()
    {
        return ten;
    }
    @Override
    public void Tinhluong(){
        int tinhluong = (int) luong * ngaylamthem;
        this.settinhluong(tinhluong);
    }

}
