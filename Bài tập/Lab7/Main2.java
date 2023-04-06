/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Main2 {
    public static void main(String[] args) {
        HangSanXuat hsxoto=new HangSanXuat("Ford", "My");
        HangSanXuat hsxxd=new HangSanXuat("Miyata", "Nhat");
        HangSanXuat hsxmb=new HangSanXuat("British", "Anh");
        PhuongTienDichuyen p1=new XeOto(hsxoto,"Xang");
        PhuongTienDichuyen p2=new XeDap(hsxxd);
        PhuongTienDichuyen p3=new MayBay(hsxmb, "Avgas");
        System.out.println("Loai phuong tien:"+p3.getLoaiphuongtien());
        System.out.print("Van toc:"+p3.layVanToc());
        System.out.println(" Hang san xuat:"+p3.laytenHangSanXuat());
        p3.batdau();
        p3.tangtoc();
        p3.dunglai();
    }
}
