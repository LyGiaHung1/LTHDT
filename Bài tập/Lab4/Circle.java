/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;


/**
 *
 * @author Acer
 */
public class Circle {

    double radius;
    String color;
    double Area;
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea()
    {
        return Area;
    }
    public String tostring()
    {
        
        return "Ban kinh:"+this.radius+"va Mau sac cua hinh tron"+this.color;
    }
}
