/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.time.LocalDate;

/**
 *
 * @author Acer
 */
public class GiaoDichNha extends GiaoDich{
    String loainha;
    String diachi;

    public GiaoDichNha() {
    }

    public GiaoDichNha(String loainha,String diachi, int magiaodich, LocalDate ngaygiaodich, double dongia, double dientich) {
        super(magiaodich, ngaygiaodich, dongia, dientich);
        this.loainha = loainha;
        this.diachi = diachi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getLoainha() {
        return loainha;
    }

    public void setLoainha(String loainha) {
        this.loainha = loainha;
    }
    
    public void Nhap()
    {
        System.out.print("Nhap ma giao dich:");
        magiaodich=sc.nextInt();
        System.out.print("Nhap don gia:");
        dongia=sc.nextDouble();
        System.out.print("Nhap dien tich:");
        dientich=sc.nextDouble();
        System.out.print("Nhap loai nha giao dich:");
        loainha=sc.next();
        System.out.print("Nhap dia chi nha:");
        diachi=sc.next();
    }
    public double thanhtien()
    {
        if(loainha.equals("caocap"))
        {
            thanhtien = dientich * dongia;
        }
        else if(loainha.equals("thuong"))
        {
            thanhtien = dientich * dongia * 0.9;
        }
        return thanhtien;
    }
}
