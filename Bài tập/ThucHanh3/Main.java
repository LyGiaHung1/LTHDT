
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Main {
    public static void main(String[] args) {
        Order od1 = new Order(1, LocalDate.now());
        od1.addLineItem(new Product("Nuoc tuong", "sp4", 8000), 10);
        od1.addLineItem(new Product("Gao", "sp1", 18000), 5);
        od1.addLineItem(new Product("Duong", "sp3", 10000), 1);
        od1.addLineItem(new Product("Gao", "sp1", 18000), 1);
        od1.addLineItem(new Product("Nuoc ngot", "sp5", 8000), 16);
        od1.addLineItem(new Product("Banh mi", "sp6", 8000), 10);
        od1.addLineItem(new Product("Nuoc loc", "sp7", 8000), 6);
        System.out.println("Ma hoa don:"+od1.orderID);
        System.out.println("Ngay lap hoa don:"+od1.ngaynhaphoadon());
        od1.out();
        od1.output();      
    }
}
