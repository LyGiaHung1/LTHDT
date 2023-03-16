/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanvien;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        HSCT hs = new HSCT();
        hs.Nhap();
        System.out.println(""+hs.Diemtrungbinh());
    }
    
}
