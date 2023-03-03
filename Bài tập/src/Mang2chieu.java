
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
class Mang2chieu {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so dong:");
        int n = sc.nextInt();
        System.out.print("Nhap so cot:");
        int m = sc.nextInt();
        int[][] arr=new int[n][m];
        Nhap(arr,n,m);
        Inmatran(arr,n,m);
}
    public static void Inmatran(int [][] arr,int n, int m)
    {
        System.out.println("Ma tran sau khi nhap la:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void Nhap(int [][] arr, int n,int m)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print( "Moi ban nhap dong thu i= " + i + "cot thu j= " + j +":");
                arr[i][j] = sc.nextInt();
            }
        }
    }
}
