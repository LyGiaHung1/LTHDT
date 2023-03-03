
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Tiendien {
    public static void main(String[] args) 
    {
        Tinhtiendien();
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
