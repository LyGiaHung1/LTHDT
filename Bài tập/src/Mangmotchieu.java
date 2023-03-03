
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Mangmotchieu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu can dung: ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.print("Nhap cac phan tu: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        sortASC(arr);
        System.out.print("Mang sau khi duoc sap xep la: ");
        show(arr);
        int x,c;
        System.out.print("Nhap vao x:");
        x=sc.nextInt();
        int i;
        for( c = i = 0;i<n;i++)
        {
           if(arr[i] != x)
           {
               arr[c]=arr[i];
               c++;
           }
        }
        n=c;
        System.out.println("Mang sau khi xoa "  + x +  " la:");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\n");
        }
    }
    public static void sortASC(int [] arr) {
        int y= arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    y= arr[j];
                    arr[j] = arr[i];
                    arr[i] = y;
                }
            }
        }
    }
    public static void show(int [] arr) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i]+ " ");
        }
    }
}


 
    

