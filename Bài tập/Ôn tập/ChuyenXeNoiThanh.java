/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class ChuyenXeNoiThanh extends ChuyenXe{
    public String Sotuyen;
    public float Kmdiduoc;

   

    public ChuyenXeNoiThanh() {
    }

    public ChuyenXeNoiThanh(String Sotuyen, float Kmdiduoc, String Machuyenxe, String Tentaixe, String Soxe, float Doanhthu) {
        super(Machuyenxe, Tentaixe, Soxe,Doanhthu);
        this.Sotuyen = Sotuyen;
        this.Kmdiduoc = Kmdiduoc;
    }
    
    public String getSotuyen() {
        return Sotuyen;
    }

    public void setSotuyen(String Sotuyen) {
        this.Sotuyen = Sotuyen;
    }

    public float getKmdiduoc() {
        return Kmdiduoc;
    }

    public void setKmdiduoc(float Kmdiduoc) {
        this.Kmdiduoc = Kmdiduoc;
    }

    @Override
    public float getDoanhthu() {
        return Doanhthu;
    }

    @Override
    public void setDoanhthu(float Doanhthu) {
        this.Doanhthu = Doanhthu;
    }

     @Override
    public String toString() {
        return "ChuyenXeNoiThanh{" + "Sotuyen=" + Sotuyen + ", Kmdiduoc=" + Kmdiduoc + '}';
    }
    public void Xuat()
    {
        System.out.println("Chuyen xe noi thanh:");
        System.out.println("Ma chuyen xe:"+Machuyenxe+" Ten tai xe:"+Tentaixe+" So xe:"+Soxe+" Doanh thu:"+Doanhthu+" So tuyen:"+Sotuyen+" So km di duoc:"+Kmdiduoc);
    }
}
