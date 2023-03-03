package Baitapvenha;


import Baitapvenha.Book;
import Baitapvenha.Student;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Project {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Book Book=new Book();
        Student ST=new Student();
        System.out.print("Nhap ten Sinh vien:");
        ST.Name=sc.nextLine();
        System.out.print("Nhap vao lop cua Sinh vien:");
        ST.Lop=sc.nextLine();
        System.out.print("Nhap vao ma Sinh vien:");
        ST.ID=sc.nextLine();
        System.out.print("Nhap vao ma Sach:");
        Book.Code=sc.nextLine();
        System.out.print("Nhap vao the loai sach:");
        Book.title=sc.nextLine();
        System.out.print("Nhap vao ten tac gia:");
        Book.tacgia=sc.nextLine();
        System.out.println("Ten sinh vien la:"+ST.getName());
        System.out.println("Lop cua sinh vien la:"+ST.getLop());
        System.out.println("Ma sinh vien:"+ST.getID());
        System.out.println("Ma cua sach la:"+Book.getCode());
        System.out.println("The loai scah la:"+Book.gettitle());
        System.out.println("Ten tac gia la:"+Book.gettacgia());
    }
}
