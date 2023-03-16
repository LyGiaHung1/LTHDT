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
public class HSCT extends HocSinh {
  
   @Override
   public float Diemtrungbinh(){
       dtb=(2*toan+ly+hoa)/4;
       System.out.println("Vi la hoc sinh chuyen toan nen toan nhan 2");
       return dtb;
   }
}
