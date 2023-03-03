
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Phuongtrinhbacnhat {
    
    public static void main(String[] args)
    {
        GiaiPTbac1();
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
}
