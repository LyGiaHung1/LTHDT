/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class List {
    ArrayList<HangHoa> listHangHoa = new ArrayList<HangHoa>();
    HangHoa hh;
    HangThucPham htp;
    HangDienMay hdm;
    HangSanhSu hss;
    Scanner sc=new Scanner(System.in);
    int chon;
    public void menu()
    {
        do{
            System.out.println("1.Them san pham Hang dien may");
            System.out.println("2.Them san pham Hang thuc pham");
            System.out.println("3.Them san pham hang sanh su");
            System.out.println("4.In danh sach");
            System.out.print("Chon 1 chuc nang:");
            chon=sc.nextInt();
            switch(chon)
            {
                case 1:
                    hdm =new HangDienMay(12, 35, "DL1", "May lanh Toshiba", 2, 3500000);
                    listHangHoa.add(hh);
                    System.out.println("Da them");
                    break;
                case 2:
                    htp = new HangThucPham("TP05", "Gao", 5, 12000, "Tiem gao Thanh Son", LocalDate.now(), LocalDate.of(2023, 05, 20));
                    listHangHoa.add(hh);
                    System.out.println("Da them");
                    break;
                case 3:
                    hss = new HangSanhSu("YellowPass", "KL1", "Binh hoa canh dao",60, 500000);
                    listHangHoa.add(hh);
                    System.out.println("Da them");
                    break;
                case 4:
                    System.out.format("%-20s %-20s %20s %20s %20s %20s\n",
                "Ma hang",
                "Ten hang",
                "Ton kho",
                "Gia",
                "VAT",
                "Muc do ban");
                System.out.println("============================================================================================================================================================");
                System.out.format("%-20s %-20s %20s %20.2f %20.2fs %20s\n",
                            hdm.getMahang(),
                            hdm.getTenhang(),
                            hdm.getTonkho(),
                            hdm.getGia(),
                            hdm.VAT(),
                            "Ban duoc");
                System.out.format("%-20s %-20s %20s %20.2f %20.2fs %20s\n",
                            htp.getMahang(),
                            htp.getTenhang(),
                            htp.getTonkho(),
                            htp.getGia(),
                            htp.VAT(),
                            "Kho ban");
                System.out.format("%-20s %-20s %20s %20.2f %20.2fs %20s\n",
                            hss.getMahang(),
                            hss.getTenhang(),
                            hss.getTonkho(),
                            hss.getGia(),
                            hss.VAT(),
                            "Ban cham");                    
                break;
            }
        }while(chon !=4);
    }
}
