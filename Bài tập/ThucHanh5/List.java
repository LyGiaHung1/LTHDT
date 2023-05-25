/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class List {
    Scanner sc = new Scanner(System.in);
    ArrayList<PhongLyThuyet> listlt = new ArrayList<>();
    ArrayList<PhongMayTinh> listmt = new ArrayList<>();
    ArrayList<PhongThiNghiem> listtn = new ArrayList<>();
    PhongHoc ph;
    PhongLyThuyet phlt;
    PhongMayTinh phmt;
    PhongThiNghiem phtn;
    int chon;
    String ma;

    public String datchuanlt() {
        if (phlt.sobongden / phlt.dientich >= 0.1) {
            return "Dat chuan";
        }
        return "Khong dat chuan";
    }

    public String datchuanmt() {
        if (phmt.sobongden / phmt.dientich >= 0.1) {
            return "Dat chuan";
        }
        return "Khong dat chuan";
    }

    public String datchuantn() {
        if (phtn.sobongden / phtn.dientich >= 0.1) {
            return "Dat chuan";
        }
        return "Khong dat chuan";
    }

    public void menu() {
        do {
            System.out.println("1.Them Phong Ly thuyet");
            System.out.println("2.Them Phong May tinh");
            System.out.println("3.Them Phong Thi nghiem");
            System.out.println("4.Tim phong");
            System.out.println("5.Xoa phong");
            System.out.println("6.In ra danh sach cac phong");
            System.out.println("7.In ra danh sach cac phong dat chuan");
            System.out.println("8.Sap xep tang theo day nha");
            System.out.println("9.Sap xep giam theo dien tich");
            System.out.println("10.Sap xep tang theo so bong den");
            System.out.println("11.Cap nhat phong may tinh");
            System.out.println("12.Tong so phong hoc");
            System.out.println("13.In cac phong may co 60 may");
            System.out.println("14.Thoat");
            System.out.print("Chon 1 chuc nang:");
            chon = sc.nextInt();
            System.out.println("==================================================================================================================================================================");
            switch (chon) {
                case 1:
                    System.out.println("Them Phong Ly thuyet");
                    phlt = new PhongLyThuyet();
                    phlt.Nhap();
                    listlt.add(phlt);
                    System.out.println("Da them");
                    System.out.println("===================================================================================================================================================================");
                    break;
                case 2:
                    System.out.println("Them Phong May tinh");
                    phmt = new PhongMayTinh();
                    phmt.Nhap();
                    listmt.add(phmt);
                    System.out.println("Da them");
                    System.out.println("======================================================================================================================================================");
                    break;
                case 3:
                    System.out.println("Them Phong Thi nghiem");
                    phtn = new PhongThiNghiem();
                    phtn.Nhap();
                    listtn.add(phtn);
                    System.out.println("Da them");
                    System.out.println("====================================================================================================================================================");
                    break;
                case 4:
                    System.out.print("Nhap ma phong can tim:");
                    ma = sc.next();
                    for (PhongLyThuyet phtl : listlt) {
                        if (phtl.maphong.equalsIgnoreCase(ma)) {
                            System.out.println("Thong tin phong:Ma phong:" + phlt.getMaphong() + ",Day nha:" + phlt.getDaynha()
                                    + ",Dien tich:" + phtl.getDientich() + ",So bong den:" + phlt.getSobongden() + ",May chieu:" + phtl.getMaychieu());
                            break;
                        }
                    }
                    for (PhongMayTinh phmt : listmt) {
                        if (phmt.maphong.equalsIgnoreCase(ma)) {
                            System.out.println("Thong tin phong:Ma phong:" + phmt.getMaphong() + ",Day nha:" + phmt.getDaynha()
                                    + ",Dien tich:" + phmt.getDientich() + ",So bong den:" + phmt.getSobongden() + ",So may tinh:" + phmt.getSomaytinh());
                            break;
                        }
                    }
                    for (PhongThiNghiem phtn : listtn) {
                        if (phtn.maphong.equalsIgnoreCase(ma)) {
                            System.out.println("Thong tin phong:Ma phong:" + phtn.getMaphong() + ",Day nha:" + phtn.getDaynha()
                                    + ",Dien tich:" + phtn.getDientich() + ",So bong den:" + phtn.getSobongden() + ",Chuyen nganh:" + phtn.getChuyennganh()
                                    + ",Suc chua:" + phtn.getSuchua() + ",Bon rua:" + phtn.getBonrua());
                            break;
                        }
                        System.out.println("Khong tim thay phong");
                    }
                    System.out.println("====================================================================================================================================================");
                    break;
                case 5:
                    System.out.print("Nhap ma phong can xoa:");
                    ma = sc.next();
                    for (PhongLyThuyet phtl : listlt) {
                        if (phtl.maphong.equalsIgnoreCase(ma)) {
                            System.out.print("Ban co chac muon xoa khong(co/khong):");
                            String xacnhan = sc.next();
                            if (xacnhan.equalsIgnoreCase("co")) {
                                listlt.remove(phlt.maphong);
                            }
                            break;
                        }
                    }
                    for (PhongMayTinh phmt : listmt) {
                        if (phmt.maphong.equalsIgnoreCase(ma)) {
                            System.out.print("Ban co chac muon xoa khong(co/khong):");
                            String xacnhan = sc.next();
                            if (xacnhan.equalsIgnoreCase("co")) {
                                listlt.remove(phmt.maphong);
                            }
                            break;
                        }
                    }
                    for (PhongThiNghiem phtn : listtn) {
                        if (phtn.maphong.equalsIgnoreCase(ma)) {
                            System.out.print("Ban co chac muon xoa khong(co/khong):");
                            String xacnhan = sc.next();
                            if (xacnhan.equalsIgnoreCase("co")) {
                                listlt.remove(phtn.maphong);
                            }
                            break;
                        } else {
                            System.out.println("Khong tim thay phong");
                        }
                    }
                    System.out.println("=======================================================================================================================================================");
                    break;
                case 6:
                    System.out.format("%-30s %-40s %-30s %15s %15s %15s %15s %15s %15s %15s\n",
                            "Ma phong",
                            "Day nha",
                            "Dien tich",
                            "So bong den",
                            "May chieu",
                            "So may tinh",
                            "Chuyen nganh",
                            "Suc chua",
                            "Bon rua",
                            "Dat chuan");
                    for (PhongLyThuyet phlt : listlt) {
                        System.out.format("%-30s %-40s %-30s %15s %15s %15s %15s %15s %15s\n",
                                phlt.getMaphong(),
                                phlt.getDaynha(),
                                phlt.getDientich(),
                                phlt.getSobongden(),
                                phlt.check(),
                                "khong co",
                                "Khong co",
                                "Hon 100",
                                "Khong co",
                                datchuanlt());
                    }
                    for (PhongMayTinh phmt : listmt) {
                        System.out.format("%-30s %-40s %-30s %15s %15s %15s %15s %15s %15s\n",
                                phmt.getMaphong(),
                                phmt.getDaynha(),
                                phmt.getDientich(),
                                phmt.getSobongden(),
                                "Khong co",
                                phmt.getSomaytinh(),
                                "Khong co",
                                "50",
                                "Khong co",
                                datchuanmt());

                    }
                    for (PhongThiNghiem phtn : listtn) {
                        System.out.format("%-30s %-40s %-30s %15s %15s %15s %15s %15s %15s\n",
                                phtn.getMaphong(),
                                phtn.getDaynha(),
                                phtn.getDientich(),
                                phtn.getSobongden(),
                                "Khong co",
                                "khong co",
                                phtn.getChuyennganh(),
                                phtn.getSuchua(),
                                phtn.check(),
                                datchuantn());
                    }
                    System.out.println("======================================================================================================================================================");
                    break;
                case 7:
                    System.out.format("%-30s %-40s %-30s %15s %15s %15s %15s %15s %15s %15s\n",
                            "Ma phong",
                            "Day nha",
                            "Dien tich",
                            "So bong den",
                            "May chieu",
                            "So may tinh",
                            "Chuyen nganh",
                            "Suc chua",
                            "Bon rua",
                            "Dat chuan");
                    if (datchuanlt() == "Dat chuan") {
                        for (PhongLyThuyet phlt : listlt) {
                            System.out.format("%-30s %-40s %-30s %15s %15s %15s %15s %15s %15s\n",
                                    phlt.getMaphong(),
                                    phlt.getDaynha(),
                                    phlt.getDientich(),
                                    phlt.getSobongden(),
                                    phlt.check(),
                                    "khong co",
                                    "Khong co",
                                    "Hon 100",
                                    "Khong co",
                                    datchuanlt());
                        }
                    }
                    if (datchuanmt() == "Dat chuan") {
                        for (PhongMayTinh phmt : listmt) {
                            System.out.format("%-30s %-40s %-30s %15s %15s %15s %15s %15s %15s\n",
                                    phmt.getMaphong(),
                                    phmt.getDaynha(),
                                    phmt.getDientich(),
                                    phmt.getSobongden(),
                                    "Khong co",
                                    phmt.getSomaytinh(),
                                    "Khong co",
                                    "50",
                                    "Khong co",
                                    datchuanmt());

                        }
                    }
                    if (datchuantn() == "Dat chuan") {
                        for (PhongThiNghiem phtn : listtn) {
                            System.out.format("%-30s %-40s %-30s %15s %15s %15s %15s %15s %15s\n",
                                    phtn.getMaphong(),
                                    phtn.getDaynha(),
                                    phtn.getDientich(),
                                    phtn.getSobongden(),
                                    "Khong co",
                                    "khong co",
                                    phtn.getChuyennganh(),
                                    phtn.getSuchua(),
                                    phtn.check(),
                                    datchuantn());
                        }
                    }
                    System.out.println("=============================================================================================================================================");
                    break;
                case 8:
                    sapXepTheoDayNha();
                    break;
                case 9:
                    sapXepTheoDienTich();
                    break;
                case 10:
                    sapXepTheoSoBongDen();
                    break;
                case 11:
                    System.out.print("Nhap ma phong can cap nhat:");
                    ma = sc.next();
                    for (PhongMayTinh phmt : listmt) {
                        if (phmt.maphong.equalsIgnoreCase(ma)) {
                            phmt.Nhap();
                            listmt.add(phmt);
                            break;
                        }
                    }
                    break;
                case 12:
                    int tong = listlt.size() + listmt.size() + listtn.size();
                    System.out.println("Tong so phong hoc:" + tong);
                case 13:
                    for (PhongMayTinh phmt : listmt) {
                        if (phmt.somaytinh == 60) {
                            System.out.format("%-30s %-40s %-30s %15s %15s %15s\n",
                                    "Ma phong",
                                    "Day nha",
                                    "Dien tich",
                                    "So bong den",
                                    "So may tinh",
                                    "Dat chuan");
                            System.out.format("%-30s %-40s %-30s %15s %15s %15s\n",
                                    phmt.getMaphong(),
                                    phmt.getDaynha(),
                                    phmt.getDientich(),
                                    phmt.getSobongden(),
                                    phmt.getSomaytinh(),
                                    datchuanmt());
                        }
                    }
                case 14:
                default:
                    System.out.println("Da thoat");
            }
        } while (chon != 14);
    }
    
    public void sapXepTheoDayNha() {
        Collections.sort(listlt, (phong1, phong2) -> phong1.getDaynha().compareTo(phong2.getDaynha()));
        System.out.println("Danh sách phòng học đã được sắp xếp tăng dần theo cột dãy nhà.");
    }

    public void sapXepTheoDienTich() {
        Collections.sort(listlt, (phong1, phong2) -> Double.compare(phong1.getDientich(), phong2.getDientich()));
        System.out.println("Danh sách phòng học đã được sắp xếp giảm dần theo cột diện tích.");
    }

    public void sapXepTheoSoBongDen() {
        Collections.sort(listlt, (phong1, phong2) -> Integer.compare(phong1.getSobongden(), phong2.getSobongden()));
        System.out.println("Danh sách phòng học đã được sắp xếp tăng dần theo cột số bóng đèn.");
    }
}
