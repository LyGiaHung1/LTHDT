
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Docsosangchu 
{
    public static void main(String[] args) 
    {
     int a,b,c,n;
     Scanner sc=new Scanner(System.in);
     do
     {
         System.out.print("Nhap n:");
         n=sc.nextInt();
     }
     while( n<100 || n>999);
     a= n%10;
     b=(n/10)%10;
     c=n/100;
    switch (c)
    {
        case 1:
            System.out.print("Mot tram  ");
            break;
        case 2:
            System.out.print("Hai tram  ");
            break;
        case 3:
            System.out.print("Ba tram%  ");
            break;
        case 4:
            System.out.print("Bon tram  ");
            break;
        case 5:
            System.out.print("Nam tram  ");
            break;
        case 6:
            System.out.print("Sau tram  ");
            break;
        case 7:
            System.out.print("Bay tram  ");
            break;
        case 8:
            System.out.print("Tam tram  ");
            break;
        case 9:
            System.out.print("Chin tram  ");
            break;
    }
    switch (b)
    {
        case 1:
            System.out.print("Muoi  ");
            break;
        case 2:
            System.out.print("Hai muoi  ");
            break;
        case 3:
            System.out.print("Ba muoi  ");
            break;
        case 4:
            System.out.print("Bon muoi  ");
            break;
        case 5:
            System.out.print("Nam muoi  ");
            break;
        case 6:
            System.out.print("Sau muoi  ");
            break;
        case 7:
            System.out.print("Bay muoi  ");
            break;
        case 8:
            System.out.print("Tam muoi  ");
            break;
        case 9:
            System.out.print("Chin muoi  ");
            break;
    }
    switch (a)
    {
        case 1:
            System.out.print("mot  ");
            break;
        case 2:
            System.out.print("hai  ");
            break;
        case 3:
            System.out.print("ba  ");
            break;
        case 4:
            System.out.print("bon  ");
            break;
        case 5:
            System.out.print("nam  ");
            break;
        case 6:
            System.out.print("sau  ");
            break;
        case 7:
            System.out.print("bay  ");
            break;
        case 8:
            System.out.print("tam  ");
            break;
        case 9:
            System.out.print("chin  ");
            break;
    }
} 
}
