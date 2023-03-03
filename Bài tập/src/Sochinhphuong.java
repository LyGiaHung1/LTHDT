
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Sochinhphuong {
    public static void main(String[] args) 
    {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap vao x=");
        x=sc.nextInt();
        float kq = (float) Math.sqrt(x);
        if(kq==(int)kq)
        {
            System.out.printf("%d la so chinh phuong\n",x);
        }
        else
        {
            System.out.printf("%d khong phai la so chinh phuong\n",x);
        }
            
    }
    
}
