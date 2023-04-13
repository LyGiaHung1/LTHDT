
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class ArrayListSoThuc {
    public static ArrayList<Double> arrso=new ArrayList<>();
    public static void main(String[] args) 
    {
        Nhap();
        Xuat();
        Tong();
    }
        
    public static void Nhap(){
        Scanner sothuc=new Scanner(System.in);
        Scanner chuoi=new Scanner(System.in);
        String tt="";
        double so;
        while(true)
        {
            System.out.print("Nhap so thuc:");
            so=sothuc.nextDouble();
            arrso.add(so);
            
            System.out.print("Ban muon nhap tiep hay khong-y/n:");
            tt=chuoi.nextLine();
            
            if(tt.equalsIgnoreCase("n"))
                break;

        }
    }
      public static void Xuat()
    {
       System.out.println("Danh sach cac so thuc da nhap");
       for(double so:arrso)
          System.out.println(so);
    }   
      public static void Tong()
      {
          double tong=0;
          for(double s:arrso)
              tong=tong+s;
          System.out.println("Tong danh sach:"+tong);
      }
}
