/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author Acer
 */
public class PhongMayTinh extends PhongHoc{
    int somaytinh;

    public PhongMayTinh() {
    }

    public PhongMayTinh(int somaytinh, String maphong, String daynha, double dientich, int sobongden) {
        super(maphong, daynha, dientich, sobongden);
        this.somaytinh = somaytinh;
    }

    public int getSomaytinh() {
        return somaytinh;
    }

    public void setSomaytinh(int somaytinh) {
        this.somaytinh = somaytinh;
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
        System.out.print("Nhap so may tinh:");
        somaytinh=sc.nextInt();
    }
}
