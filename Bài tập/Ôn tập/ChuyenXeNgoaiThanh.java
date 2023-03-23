/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class ChuyenXeNgoaiThanh extends ChuyenXe{
    public String Noiden;
    public int Ngaydi;

    public ChuyenXeNgoaiThanh() {
    }

    public ChuyenXeNgoaiThanh(String Noiden, int Ngaydi, String Machuyenxe, String Tentaixe, String Soxe,float Doanhthu) {
        super(Machuyenxe, Tentaixe, Soxe,Doanhthu);
        this.Noiden = Noiden;
        this.Ngaydi = Ngaydi;
    }

    public String getNoiden() {
        return Noiden;
    }

    public void setNoiden(String Noiden) {
        this.Noiden = Noiden;
    }

    public int getNgaydi() {
        return Ngaydi;
    }

    public void setNgaydi(int Ngaydi) {
        this.Ngaydi = Ngaydi;
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
        return  "ChuyenXeNgoaiThanh{" + "Noiden=" + Noiden + ", Ngaydi=" + Ngaydi + '}';
     
    }
    public void Xuat()
    {
        System.out.println("Chuyen xe ngoai thanh:");
        System.out.println("Ma chuyen xe:"+Machuyenxe+" Ten tai xe:"+Tentaixe+" So xe:"+Soxe+" Doanh thu:"+Doanhthu+" Noi den:"+Noiden+" Ngay di:"+Ngaydi);
    }
    
}
