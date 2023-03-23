
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
public class DanhSachHinh {
    ArrayList<HinhHoc> listHinhhoc =new ArrayList<HinhHoc>();
    Scanner sc=new Scanner(System.in);
    HinhHoc HH;
    int chon;
    public DanhSachHinh(){
        super();        
    }
    public void Nhap(int n)
    {
        for(int i=1;i<=n;i++)
        {
            System.out.println("1 Hinh chu nhat");
            System.out.println("2 Hinh tron");
            chon=sc.nextInt();sc.nextLine();
            switch(chon)
            {
            case 1:
            {
                float PI;
                float cd;
                float cr;
                System.out.print("Nhap vao chieu dai:");
                cd=sc.nextFloat();
                System.out.print("Nhap vao chieu rong:");
                cr=sc.nextFloat();
                HH=new HinhChuNhat(cd, cr);
                listHinhhoc.add(HH);
                System.out.println("Them thanh cong");
            }
                break;
            case 2:
            {
                float R;
                System.out.print("Nhap vao banh kinh:");
                R=sc.nextFloat();
                HH=new HinhTron(R);
                listHinhhoc.add(HH);
            }
                break;
               
            default:
                break;
            }
        }
    }
    public void Xuat()
    {
        for(HinhHoc HH:listHinhhoc)
        {
            System.out.println(HH.toString());
        }
    }
}
