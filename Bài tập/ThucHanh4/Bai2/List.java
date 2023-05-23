/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import Bai1.GiaoDichDat;
import Bai1.GiaoDichNha;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class List {
    DecimalFormat f = new DecimalFormat("###,###");
    ArrayList<KhachHangVietNam> listvn = new ArrayList<>();
    ArrayList<KhachHangNuocNgoai> listnn = new ArrayList<>();
    KhachHang kh;
    KhachHangNuocNgoai khnn;
    KhachHangVietNam khvn;
    double total = 0,thanhtien=0;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total +=total;
    }
    
     public double thanhtien()
    {
        return khnn.dongia * khnn.soluong;
    }
    
    Scanner sc = new Scanner(System.in);
    int chon;

    public void menu() {
        do {
            System.out.println("1.Them hoa don khach hang Viet Nam");
            System.out.println("2.Them hoa don khach hang Nuoc ngoai");
            System.out.println("3.So luong hoa don khach hang Viet Nam");
            System.out.println("4.So luong hoa don khach hang Nuoc ngoai");
            System.out.println("5.Trung binh tien cua khach Nuoc ngoai");
            System.out.println("6.In ra cac Hoa don");
            System.out.println("7.Thoat");
            System.out.print("Chon 1 chuc nang:");
            chon = sc.nextInt();
            System.out.println("==============================================================================================");
            switch (chon) {
                case 1:
                    System.out.println("Hoa don Viet Nam");
                    khvn = new KhachHangVietNam();
                    khvn.Nhap();
                    listvn.add(khvn);
                    System.out.println("Da them");
                    System.out.println("===============================================================================================");
                    break;
                case 2:
                    System.out.println("Hoa don Nuoc ngoai");
                    khnn = new KhachHangNuocNgoai();
                    khnn.Nhap();
                    listnn.add(khnn);
                    setTotal(thanhtien());
                    System.out.println("Da them");
                    System.out.println("===============================================================================================");
                    break;
                case 3:
                    System.out.println("So luong hoa don Viet Nam:"+listvn.size());
                    System.out.println("========================================================================================");
                    break;
                case 4:
                    System.out.println("So luong hoa don Nuoc ngoai:"+listnn.size());
                    System.out.println("=========================================================================================");
                    break;
                case 5:
                    System.out.printf("So tien trung binh cua hoa don khach Nuoc ngoai:" + getTotal()/listnn.size()+"\n");
                    System.out.println("=======================================================================================");
                    break;
                case 6:
                    System.out.format("%-20s %-20s %-20s %-20s %-20s %-20s %20s %20s %20s\n",
                            "Ma khach hang",
                            "Ten khach hang",
                            "Ngay hoa don",
                            "So KW",
                            "Don gia",
                            "Thanh tien",
                            "Doi tuong sinh hoat",
                            "Dinh muc",
                            "Quoc tich");
                    for (KhachHangVietNam khvn:listvn) {
                        System.out.format("%-20s %-20s %-20s %-20s %-20s %-20s %20s %20s %20s\n",
                                khvn.getMakhachhang(),
                                khvn.getHoten(),
                                khvn.ngayhoadon(),
                                f.format(khvn.getSoluong()),
                                f.format(khvn.getDongia()),
                                f.format(khvn.thanhtien()),
                                khvn.getDoituong(),
                                khvn.getDinhmuc(),
                                "Viet nam");
                    }
                    for (KhachHangNuocNgoai khnn:listnn) {
                        System.out.format("%-20s %-20s %-20s %-20s %-20s %-20s %20s %20s %20s\n",
                               khnn.getMakhachhang(),
                               khnn.getHoten(),
                               khnn.ngayhoadon(),
                               f.format(khnn.getSoluong()),
                               f.format(khnn.getDongia()),
                               f.format(khnn.thanhtien()),
                               "khong co",
                               "khong co",
                               khnn.getQuoctich());
                    }
                    System.out.println("============================================================================================");
            }
        } while (chon != 7);
    }
}
