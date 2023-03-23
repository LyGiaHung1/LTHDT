/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Bai3 {
    public static void main(String[] args) {
        GiaoDichTien GDT =new GiaoDichTien(23000, 1, "02", "23", 12, 5);
        GiaoDichTien EURO=new GiaoDichTien(25000, 2, "01", "20", 5, 5);
        GiaoDichTien VN=new GiaoDichTien(3, 3, "03", "19", 10, 10000);
        double Tong=GDT.soluong+EURO.soluong+VN.soluong;
        System.out.println("Tong so luong:"+Tong);
        GDT.Thanhtien();
        EURO.Thanhtien();
        VN.Thanhtien();
        GiaoDichVang GDV= new GiaoDichVang("9999", "03", "21", 5,5 );
        GDV.Thanhtien();
    }
}
