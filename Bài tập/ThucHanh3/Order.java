
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
public class Order {
    ArrayList<OrderDetail> lineItems = new ArrayList<OrderDetail>();
    OrderDetail od;
    Product p = new Product();
    Scanner sc= new Scanner(System.in);
    int orderID,count=1;
    double total=0;
    LocalDate orderDate = LocalDate.now();

    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total += total;
    }

    public void addLineItem(Product p,int q)
    {      
        lineItems.add(new OrderDetail(p,q));
    }
    public double calcTotalPrice(int quatity,double price)
    {
        return quatity * price;
    }
    public String ngaynhaphoadon()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        String ngay = dtf.format(orderDate);
        return ngay;
    }
    public void out()
    {
        int i=1;
        System.out.println("");
         System.out.format("%-5s | %-5s | %-15s | %15s | %15s | %15s\n",
                "STT",
                "Ma SP",
                "Mo ta",
                "Don gia",
                "So luong",
                "Thanh tien");
    }
    public void output()
    {
        int count=1;
        DecimalFormat f = new DecimalFormat("###,###");
                for(OrderDetail od:lineItems){
                    System.out.format("%-5d | %-5s | %-15s | %15s | %15s | %15s\n",
                            count,
                            od.product.getProductID(),
                            od.product.getDesciption(),
                            f.format(od.product.getPrice()),
                            od.getQuatity(),
                            f.format(calcTotalPrice(od.getQuatity(),od.product.getPrice())));
//                            od.calcTotalPrice());
                         setTotal(calcTotalPrice(od.getQuatity(),od.product.getPrice()));
                count++;
                }
                System.out.printf("Tong tien thanh toan: %s\n",f.format(getTotal()));
    }
}
