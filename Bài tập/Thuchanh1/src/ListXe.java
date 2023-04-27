
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
public class ListXe {
    ArrayList<Vehicle> listListXe =new ArrayList<Vehicle>();
    Scanner sc=new Scanner(System.in);
    Vehicle V;
    int chon;
    public ListXe()
    {
        super();
    }

    public void Menu()
    {
        do{
        System.out.println("1.Nhap thong tin xe:");
        System.out.println("2.Xuat thong tin xe");
        System.out.println("3.Thoat");
        System.out.println("Chon 1 chuc nang:");
        chon=sc.nextInt();
        switch(chon)
        {
            case 1:{
                V =new Vehicle();
                V.Nhap();
                listListXe.add(V);
                System.out.println("Da them");
            }break;
            case 2:
                System.out.format("%-30s %-30s %30s %30s %30s\n",
                "Ten chu xe",
                "Loai xe",
                "Dung tich",
                "Tri gia",
                "Thue phai nop");
                System.out.println("====================================================================================================================================================");
                for(Vehicle V:listListXe)
                    System.out.format("%-30s %-30s %30s %30.2f %30.2f\n",
                            V.getTen(),
                            V.getHang(),
                            V.getDungtich(),
                            V.getGia(),
                            V.thue());
                break;
            case 3:
            default:
            System.out.println("Da thoat");
        }
    }while( chon !=3);
    }
}
