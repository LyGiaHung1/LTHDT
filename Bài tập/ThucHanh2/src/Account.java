
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Account {
    Scanner sc=new Scanner(System.in);
    long stk,tkc,tkn,tkdh,tknap,tkrut;
    String tentk;
    double thang,tien,nap,rut,tienchuyen,chuyen,tiennhan,laisuat=0.035;

    public Account() {
    }

    public Account(long stk, String tentk, double tien, double laisuat) {
        this.stk = stk;
        this.tentk = tentk;
        this.tien = tien;
        this.laisuat = laisuat;
    }

    public long getStk() {
        return stk;
    }

    public void setStk(long stk) {
        this.stk = stk;
    }

    public String getTentk() {
        return tentk;
    }

    public void setTentk(String tentk) {
        this.tentk = tentk;
    }

    public double getTien() {
        return tien;
    }

    public void setTien(double tien) {
        this.tien = tien;
    }

    public double getLaisuat() {
        return laisuat;
    }

    public void setLaisuat(double laisuat) {
        this.laisuat = laisuat;
    }
   
    public void naptien()
    {
        do{
        System.out.print("Nhap so tai khoan can nap:");
        tknap=sc.nextLong();
        }while(tknap !=stk);
        do{
            System.out.print("Nhap so tien can nap:");
            nap=sc.nextDouble();
            if(nap > 0)
            {
                tien=tien+nap;
                System.out.println("Nap thanh cong");
            }
            else
            System.out.println("So tien nap khong hop le");
        }while(nap<0);
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
    }
    public void ruttien()
    {
        do{
        System.out.print("Nhap so tai khoan can rut:");
        tkrut=sc.nextLong();
        }while(tkrut !=stk);
        do{
        System.out.print("Nhap so tien can rut:");
        rut=sc.nextDouble();
        }while(rut >0 );
        do{
        System.out.print("Nhap so tien can rut:");
        rut=sc.nextDouble();    
        }while(rut < tien);
        if(rut <= tien)
        {
                tien=tien-rut;
                System.out.println("Rut tien thanh cong");
                System.out.println("------------------------------------------------------------------------------------------------------------------------");
        }
    }
    public void chuyentien()
    {
        do{
        System.out.print("Nhap so tai khoan chuyen tien:");
        tkc=sc.nextLong();
        }while(tkc != stk);
            tien=tienchuyen;
                do{
                System.out.print("Nhap so tai khoan nhan:");
                tkn=sc.nextLong();
                }while(tkn !=stk);
                    tien=tiennhan;
                    do{
                    System.out.print("Nhap so tien can chuyen");
                    chuyen=sc.nextLong();
                    if(chuyen <0)
                    System.out.println("So tien chuyen khong hop le");                     
                    }while(chuyen < 0);
                    if(chuyen <= tienchuyen)
                    {
                        tienchuyen=tienchuyen-chuyen;
                        tiennhan=tiennhan+chuyen;
                        System.out.println("Tai khoan "+tkc+" da chuyen "+chuyen+" vao tai khoan "+tkn);
                        System.out.println("Tai khoan "+tkn+" da nhan "+chuyen+" tu tai khoan "+tkc);
                    }
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
    }
    public void daohan()
    {
        do{
        System.out.print("Nhap so tai khoan can dao han:");
        tkdh=sc.nextLong();
        }while(tkdh !=stk);
        do{
        System.out.print("Nhap so thang can dao han:");
        thang=sc.nextDouble();
        }while(thang <= 12 && thang>=1);
        tien=tien +( (tien * laisuat) * thang);
        System.out.println("Dao han thanh cong "+thang+" thang");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
    }
    public void nhap()
    {
        System.out.print("Nhap so tai khoan:");
        stk=sc.nextLong();
        System.out.print("Nhap ten tai khoan:");
        tentk=sc.next();
        tien=50;
    }
    
}
