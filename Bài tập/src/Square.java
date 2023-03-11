/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Square extends Rectangle {
   private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }
    public Square(double side, String color,boolean filled){
        super(side, side, color, filled);
    }
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
//   @Override
//    public void setWidth(double side){
//        this.side=side;
//    }
//   @Override
//     public void setLength(double side){
//        this.side=side;
//    }
   @Override
   public String toString(){
       return "side:"+side+ " Area:" +getArea();
   }
    

    
    
   
    
}
