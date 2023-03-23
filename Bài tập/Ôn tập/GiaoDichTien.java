
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class GiaoDichTien extends GiaoDich {

    public float tigia;
    public int loaitien;

    public GiaoDichTien() {
    }

    public GiaoDichTien(float tigia, int loaitien, String MaGD, String NgayGD, float soluong, double dongia) {
        super(MaGD, NgayGD, soluong, dongia);
        this.tigia = tigia;
        this.loaitien = loaitien;
    }

    public float getTigia() {
        return tigia;
    }

    public void setTigia(float tigia) {
        this.tigia = tigia;
    }

    public int getLoaitien() {
        return loaitien;
    }

    public void setLoaitien(int loaitien) {
        this.loaitien = loaitien;
    }
    
    @Override
    public void Thanhtien() {
        double USD=soluong*dongia*tigia;
        double EURO=soluong*dongia*tigia;
        double VN=soluong*dongia;
        double tbUSD=(soluong*dongia*tigia)/3;
        double tbEURO=(soluong*dongia*tigia)/3;
        double tbVN=(soluong*dongia)/2;
        if (loaitien == 1) 
        {
            System.out.println("Loai tien USD");
            System.out.println("Thanh tien:"+USD);
            System.out.println("Trung binh:"+tbUSD);
            
        }
        else if(loaitien == 2){
            System.out.println("Loai tien EURO");
            System.out.println("Thanh tien:"+EURO);
            System.out.println("Trung binh:"+tbEURO);
        }
        else{
            System.out.println("Loai tien VN");
            System.out.println("Thanh tien:"+VN);
            System.out.println("Trung binh:"+tbVN);
        }
    }

}
