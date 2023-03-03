
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Phuongtrinhbac2 
{
    public static void main(String[] args)
    {
        GiaiPTbac2();
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
}

