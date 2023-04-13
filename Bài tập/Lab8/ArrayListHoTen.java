
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class ArrayListHoTen {
    Scanner sc=new Scanner(System.in);
    public static ArrayList<String> arrds=new ArrayList<String>();
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int lc;
        do{
            menu();
            lc=sc.nextInt();
            
            switch(lc)
            {
                case 1:
                    Nhap();
                    break;
                case 2:
                    Xuat();
                    break;
                case 3:
                    Sapxep();
                    break;
                case 4:
                    timvaxoa();
                    break;
                case 5:
                    xuatngaunhien();
                    break;
                case 6:
                default:
                    System.out.println("Thoat");
                    break;
            }
        }while(lc !=6);
    }
    static void menu()
    {
        System.out.println("1.Nhap ten vao danh sach");
        System.out.println("2.Xuat ten trong danh sach");
        System.out.println("3.Sap xep ten");
        System.out.println("4.Tim va Xoa");
        System.out.println("5.Xuat ngau nhien");
        System.out.println("6.Thoat");
        System.out.print("Chon cac lua chon:");
    }
 
    public static void timvaxoa()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten can tim va xoa:");
        String hoten=sc.nextLine();
        for(String Ten:arrds){
            if(Ten.equalsIgnoreCase(hoten)){
                arrds.remove(Ten);
                break;
            }
        }
    }
    public static void Nhap()
    {
        Scanner chuoi =new Scanner(System.in);
        String tt="";
        String Ten;
        while(true)
        {
            System.out.print("Nhap ho ten:");
            Ten=chuoi.nextLine();
            arrds.add(Ten);
            System.out.print("Ban muon nhap tiep khong-y/n:");
            tt=chuoi.nextLine();
            if(tt.equalsIgnoreCase("n"))
                break;
        }
        System.out.println("----------------------------------------");
    }
    public static void Xuat()
    {
        for(String Ten:arrds)
        System.out.println(Ten);
        System.out.println("----------------------------------------");
    }
    public static void Sapxep()
    {
        System.out.println("Danh sach sau khi sap xep la:");
        Collections.sort(arrds,(o1, o2)->o2.compareTo(o1));
        Xuat();
        System.out.println("----------------------------------------");

    }
    public static void xuatngaunhien()
    {
        Collections.shuffle(arrds);
        Xuat();
    }
}

