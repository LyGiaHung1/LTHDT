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
public class GiaoDichDat extends GiaoDich{

    String loaidat;

    public GiaoDichDat() {
    }

    public GiaoDichDat(int magiaodich, LocalDate ngaygiaodich, double dongia, double dientich,String loaidat) {
        super(magiaodich, ngaygiaodich, dongia, dientich);
        this.loaidat = loaidat;
    }
    public String getLoaidat() {
        return loaidat;
    }
    
    public void setLoaidat(String loaidat) {
        this.loaidat = loaidat;
    }
    
    public void Nhap()
    {
        System.out.print("Nhap ma giao dich:");
        magiaodich=sc.nextInt();
        System.out.print("Nhap don gia:");
        dongia=sc.nextDouble();
        System.out.print("Nhap dien tich:");
        dientich=sc.nextDouble();
        System.out.print("Nhap loai dat giao dich:");
        loaidat=sc.nextLine();
    }
    public double thanhtien()
    {
        if(loaidat.equals("B") || loaidat.equals("C"))
        {
             thanhtien = dientich * dongia;           
        }
        else if(loaidat.equals("A"))
        {
            thanhtien = dientich * dongia *1.5;
        }
        return thanhtien;
    }
}
