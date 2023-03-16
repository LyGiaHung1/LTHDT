/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nhanvien;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class HocSinh {
    private String hoTen;
    private String lop;
    public float toan;
    public float ly;
    public float hoa;
    public float dtb;
    
    public HocSinh() {
    }
    public void Nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap vao diem toan:");
        toan=sc.nextFloat();
        System.out.print("Nhap vao diem li:");
        ly=sc.nextFloat();
        System.out.print("Nhap vao diem hoa:");
        hoa=sc.nextFloat();
        
    }
    
    public HocSinh(String hoTen, String lop, float toan, float ly, float hoa,float dtb) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.dtb = dtb;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getLy() {
        return ly;
    }

    public void setLy(float ly) {
        this.ly = ly;
    }

    public float getHoa() {
        return hoa;
    }

    public void setHoa(float hoa) {
        this.hoa = hoa;
    }

    public float getDtb() {
        return dtb;
    }
    
    public float Diemtrungbinh(){
        dtb=(toan + ly + hoa) / 3;
        return dtb;
    }
}
