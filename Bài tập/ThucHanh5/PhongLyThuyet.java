/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author Acer
 */
public class PhongLyThuyet extends PhongHoc{
    String maychieu;

    public PhongLyThuyet() {
    }

    public PhongLyThuyet(String maychieu, String maphong, String daynha, double dientich, int sobongden) {
        super(maphong, daynha, dientich, sobongden);
        this.maychieu = maychieu;
    }

    public String getMaychieu() {
        return maychieu;
    }

    public void setMaychieu(String maychieu) {
        this.maychieu = maychieu;
    }
    
    public void Nhap()
    {
        System.out.print("Nhap ma phong:");
        maphong=sc.next();
        System.out.print("Nhap day nha:");
        daynha=sc.next();
        System.out.print("Nhap dien tich:");
        dientich=sc.nextDouble();
        System.out.print("Nhap so bong den:");  
        sobongden=sc.nextInt();  
        System.out.print("Co may chieu khong:");
        maychieu=sc.next();
    }
    public String check()
    {
        if(maychieu.equalsIgnoreCase("Co"))
            return "Co";
        return "Khong co";
    }
}
