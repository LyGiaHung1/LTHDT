
import java.util.Scanner;
import static javax.swing.text.html.HTML.Attribute.N;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Tinhdiemtrungbinh {
    public static void main(String[] args) {
        float a;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap vao diem trung binh:");
        a = sc.nextFloat();
        if(a<5)
        {
            System.out.println("Xep loai hoc sinh kem");
        }
        else if(a >=5 && a <7)
        {
            System.out.println("Xep loai hoc sinh trung binh");
        }
        else if(a >=7 && a<8)
        {
            System.out.println("Xep loai hoc sinh kha");
        }
        else if(a >8)
        {
            System.out.println("Xep loai hoc sinh gioi");
        }
    }
}
