
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Chuongtrinhmenu {
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("1:Giai phuong trinh bac nhat");
       System.out.println("2:Giai phuong trinh bac hai");
       System.out.println("3:Tinh tien dien");
       System.out.println("4:Ket thuc chuong trinh menu");
       System.out.print("Nhap vao chuc nang muon dung:");
       int choice = sc.nextInt();
       switch(choice)
       {
           case 1:
               System.out.println("Giai phuong trinh bac nhat");
               GiaiPTbac1();
               break;
           case 2:
               System.out.println("Giai phuong trinh bac 2");
               GiaiPTbac2();
               break;
           case 3:
               System.out.println("Tinh tien dien"); 
               Tinhtiendien();
               break;
           case 4:
               System.out.println("Ket thuc menu");
               System.exit(0);
               break;
       }
    }
    public static void GiaiPTbac1()
    {
       
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap vao a=");
        a = sc.nextInt();
        System.out.print("Nhap vao b=");
        b = sc.nextInt();
        if (a==0)
        {
            if(b==0)
            {
                System.out.println("Phuong trinh vo so nghiem\n");
            }
            else
            {
                System.out.println("Pnuong tirnh vo nghiem\n");
            }
        }
        else{
            float x= (float) -b / a;
            System.out.printf("Phuong trinh co nghiem x= %.1f\n",x);
        }
    }
    public static void GiaiPTbac2()
    {
         int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap vao a=");
        a=sc.nextInt();
        System.out.print("Nhap vao b=");
        b=sc.nextInt();
        System.out.print("Nhap vao c=");
        c=sc.nextInt();
        if(a==0)
        {
            if(b==0)
            {
                if(c==0)
                {
                    System.out.println("Phuong trinh vo so nghiem\n");
                }
                else
                {
                         System.out.println("Phuong trinh vo nghiem\n");      
                }
            }
            else
            {
                float x =(float)-b/a;
                System.out.printf("Phuong trinh co nghiem kep x=%.1f\n",x);
            }
        }
        else
        {
            int delta= (b*b)-4*a*c;
            System.out.printf("Delta=%d\n",delta);
            if(delta < 0)
            {
                System.out.println("Phuong trinh vo nghiem\n");
            }
            else if(delta==0)
            {
                float x=(float) -b/2*a;
                System.out.printf("Phuong trinh co nghiem kep x1=x2=%.1f",x);
            }
            else
            {
                float x1= (float)((-b)+Math.sqrt(delta))/2*a;               
                float x2= (float)((-b)-Math.sqrt(delta))/2*a;   
                System.out.printf("x1=%.1f\n",x1);
                System.out.printf("x2=%.1f\n",x2);
            }
        }
    }
    public static void Tinhtiendien()
    {
        int sodien,sotien,tien;
        System.out.print("Nhap vao so dien:");
        Scanner sc=new Scanner(System.in);
        sodien=sc.nextInt();
        if(sodien<50)
        {
            sotien = 1000;
            tien = sodien*1000;
            System.out.printf("So tien dien la:%d\n",tien);
        }
        else if(sodien>=50)
        {
            sotien = 1200;
            tien = 50*1000+(sodien-50)*1200;
            System.out.printf("So tien dien la:%d\n",tien);
        }
    }
 }

