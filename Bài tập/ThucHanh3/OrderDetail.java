
import java.time.LocalDate;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class OrderDetail {
    int quatity;
    Product product;
    int OrderID;

    public OrderDetail(Product product,int quatity) {
        this.product = product;
        this.quatity = quatity;
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "quatity=" + quatity + ", product=" + product + ", OrderID=" + OrderID +  '}';
    }
    
    public double calcTotalPrice()
    {
        double thanhtien= this.quatity * product.price;
        return thanhtien;
    }
}
