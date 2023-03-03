/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Test {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Hinhhoc HH=new Hinhhoc();
       HinhTron HT=new HinhTron();
       HinhChuNhat HCN=new HinhChuNhat();
       HinhTru HTru=new HinhTru();
       HinhVuong HV=new HinhVuong();
       HT.setTen("Hinh tron");
       HT.xuatten();
       HT.Nhapbankinh();
       HT.Tinhchuvi();
       HT.Tinhdientich();
       HT.Inchuvi();
       HT.Indientich();
       HCN.setTen("Hinh chu nhat");
       HCN.xuatten();
       HCN.Nhapchieudai();
       HCN.Nhapchieurong();
       HCN.Tinhchuvi();
       HCN.Tinhdientich();
       HCN.Inchuvi();
       HCN.Indientich();
       HTru.setTen("hinh tru");
       HTru.xuatten();
       HTru.Nhapvaocao();
       HTru.Nhapbankinh();
       HTru.Tinhthetich();
       HTru.Inthetich();
       HV.setTen("Hinh vuong");
       HV.xuatten();
       HV.Nhapcanh();
    }
}