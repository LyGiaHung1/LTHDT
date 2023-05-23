/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class List {
    
    DecimalFormat f = new DecimalFormat("###,###");
    ArrayList<GiaoDichDat> listgdd = new ArrayList<>();
    ArrayList<GiaoDichNha> listgdn = new ArrayList<>();
    GiaoDich gd;
    GiaoDichDat gdd;
    GiaoDichNha gdn;
    double total = 0,thanhtien=0;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total +=total;
    }
    
     public double thanhtien()
    {
        if(gdd.loaidat.equals("B") || gdd.loaidat.equals("C"))
        {
             return gdd.dientich * gdd.dongia;           
        }
        return gdd.dientich * gdd.dongia * 1.5;
    }
    
    Scanner sc = new Scanner(System.in);
    int chon;

    public void menu() {
        do {
            System.out.println("1.Them giao dich dat");
            System.out.println("2.Them giao dich nha");
            System.out.println("3.So luong giao dich dat");
            System.out.println("4.So luong giao dich nha");
            System.out.println("5.Trung binh tien giao dich dat");
            System.out.println("6.In ra cac giao dich");
            System.out.println("7.Thoat");
            System.out.print("Chon 1 chuc nang:");
            chon = sc.nextInt();
            System.out.println("==============================================================================================");
            switch (chon) {
                case 1:
                    System.out.println("Giao dich dat");
                    gdd = new GiaoDichDat();
                    gdd.Nhap();
                    listgdd.add(gdd);
                    setTotal(thanhtien());
                    System.out.println("Da them");
                    System.out.println("===============================================================================================");
                    break;
                case 2:
                    System.out.println("Giao dich nha");
                    gdn = new GiaoDichNha();
                    gdn.Nhap();
                    listgdn.add(gdn);
                    System.out.println("Da them");
                    System.out.println("===============================================================================================");
                    break;
                case 3:
                    System.out.println("So luong giao dich dat:"+listgdd.size());
                    System.out.println("========================================================================================");
                    break;
                case 4:
                    System.out.println("So luong giao dich nha:"+listgdn.size());
                    System.out.println("=========================================================================================");
                    break;
                case 5:
                    System.out.printf("So tien trung binh cua giao dich dat:" + getTotal()/listgdd.size()+"\n");
                    System.out.println("=======================================================================================");
                    break;
                case 6:
                    System.out.format("%-20s %-20s %20s %20s %20s %20s %20s\n",
                            "Ma giao dich",
                            "Ngay giao dich",
                            "Don gia",
                            "Loai",
                            "Dien tich",
                            "Thanh tien",
                            "Dia chi");
                    for (GiaoDichDat gdd : listgdd) {
                        System.out.format("%-20d %-20s %20s %20s %20s %20s\n",
                                gdd.getMagiaodich(),
                                gdd.ngaygiaodich(),
                                gdd.getDongia(),
                                gdd.getLoaidat(),
                                gdd.getDientich(),
                                gdd.thanhtien());
                    }
                    for (GiaoDichNha gdn : listgdn) {
                        System.out.format("%-20d %-20s %20s %20s %20s %20s %20s\n",
                                gdn.getMagiaodich(),
                                gdn.ngaygiaodich(),
                                gdn.getDongia(),
                                gdn.getLoainha(),
                                gdn.getDientich(),
                                gdn.thanhtien(),
                                gdn.getDiachi());
                    }
                    System.out.println("============================================================================================");
            }
        } while (chon != 7);
    }
}
