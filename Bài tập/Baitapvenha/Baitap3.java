/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitapvenha;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Baitap3 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        NhanVien NV=new NhanVien();
        System.out.print("Nhap vao ten nhan vien:");
        NV.tenNhanVien=sc.nextLine();
        System.out.print("Nhap vao he so luong:");
        NV.hesoluong=sc.nextDouble();
        System.out.print("Nhap vao luong co ban:");
        NV.luongcoban=sc.nextDouble();
        System.out.print("Nhap vao luong toi da cua nhan vien:");
        NV.luongmax=sc.nextDouble();
        System.out.println("Nhan vien ten la:"+NV.tenNhanVien);
        System.out.println("Luong nhan vien la:"+NV.luong());
        if(NV.luong<NV.luongmax)
        {
            System.out.println("Duoc tang luong ");
        }
        else
        {
            System.out.println("Khong duoc tang luong ");
        }
    }
}
