
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class ArrayListSanPham {
    public ArrayList<SanPham> list =new ArrayList<>();
    public void Nhap(){
        System.out.println("Nhap ten vao danh sach");
        Scanner sc=new Scanner(System.in);
        int i=1;
        do{
            System.out.printf("Ten san pham thu %d:",i);
            String st=sc.nextLine();
            if(st == null || st.equalsIgnoreCase("")){
                break;
            }
            System.out.print("Gia san pham:");
            double Gia=sc.nextDouble();
            list.add(new SanPham(st,Gia));
            sc.nextLine();
            i++;
        }while(true);
    }
    public void Xuat()
    {
        System.out.println("Danh sach san pham:");
        System.out.println("Ten\t\t|Gia");
        for(SanPham sanPham:list){
            System.out.printf("%20s| %.2f\n",sanPham.getTen(),sanPham.getGia());
    }
}
    public void Sapxep()
    {
        Collections.sort(list,(a, b)-> (int)(b.getGia()- a.getGia()));
        System.out.println("Danh sach sau khi sap xep giam dan:");
        Xuat();
    }
    public void Tim()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten san pham can tim va xoa:");
        String ten=sc.nextLine();
        SanPham found=null;
        for(SanPham sanPham:list)
        {
            if(sanPham.getTen().equalsIgnoreCase(ten))
            {
                found =sanPham;
                break;
            }
        }
        if(found !=null)
        {
            list.remove(found);
            System.out.println("San pham da xoa khoi danh sach");
        }
        else{
            System.out.println("San pham khong co trong danh sach");
        }
    }
    public void Tinhgiatrunhbinh()
    {
        double avg=0,sum=0;
        for(SanPham sanPham:list)
        {
            sum +=sanPham.getGia();
        }
        avg=sum/list.size();
        System.out.println("Gia trung binh cua san pham:"+avg);
    }
    public void menu(){
        do{
        System.out.println("1.Nhap danh sach san pham");
        System.out.println("2.Xuat danh sach san pham");
        System.out.println("3.Sap xep gia giam dan");
        System.out.println("4.Tim va xoa san pham");
        System.out.println("5.Xuat gia trung binh cac san pham");
        System.out.println("6.thoat");
        System.out.print("Lua chon:");
        Scanner sc=new Scanner(System.in);
        int lc=sc.nextInt();
        switch(lc)
        {
            case 1:
                Nhap();
                break;
            case 2:
                Xuat();
                break;
            case 3:
                Sapxep();
                break;
            case 4:
                Tim();
                break;
            case 5:
                Tinhgiatrunhbinh();
                break;
            case 6:
            default:
            System.out.println("Thoat");
            break;
        }
    }while(true);
}
}

