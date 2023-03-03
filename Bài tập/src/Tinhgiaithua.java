
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Tinhgiaithua {
    public static void main(String[] args) 
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n vao:");
        n=sc.nextInt();
        Giaithua(n);
    }
    public static void Giaithua(int n)
    {
        int kq=1;
        int i=1;
        while(i<=n)
        {
            kq=kq*i;
            i++;
        } 
        System.out.printf("Giai thua cua n la:%d\n",kq);
}
}
