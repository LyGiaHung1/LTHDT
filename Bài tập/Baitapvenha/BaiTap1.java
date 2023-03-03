/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitapvenha;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class BaiTap1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HinhVuong HV= new HinhVuong();
        HinhTron HT=new HinhTron();
        System.out.print("Nhap vao canh hinh vuong:");
        HV.Canh=sc.nextDouble();
        System.out.println("Hinh vuong co canh la:"+HV.getCanh());
        System.out.println("Dien tich hinh vuong la:"+HV.getS());
        System.out.println("Chu vi hinh vuong la:"+HV.getChuvi());
        System.out.print("Nhap vao duong kinh:");
        HT.DuongKinh=sc.nextDouble();
        System.out.println("Ban kinh la:"+HT.getBanKinh());
        System.out.println("Duong kinh la:"+HT.getDuongKinh());
        System.out.println("Chu vi hinh tron la:"+HT.getChuvi());
        System.out.println("Dien tich hinh tron la:"+HT.getS());
    }
    
}


