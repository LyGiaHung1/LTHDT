/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Hinhhoc {
    public float PI=(float)Math.PI;
    public String Ten;
    public float Chuvi;
    public float Dientich;
    public float Thetich;
    Scanner sc=new Scanner(System.in);
    public Hinhhoc() {
    }
    public float getPI() {
        return PI;
    }
     public void setPI(float PI) {
        this.PI = PI;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public float getChuvi() {
        return Chuvi;
    }

    public void setChuvi(float Chuvi) {
        this.Chuvi = Chuvi;
    }

    public float getDientich() {
        return Dientich;
    }

    public void setDientich(float Dientich) {
        this.Dientich = Dientich;
    }

    public float getThetich() {
        return Thetich;
    }

    public void setThetich(float Thetich) {
        this.Thetich = Thetich;
    }

    public void xuatten()
    {
        System.out.println("Ten:"+this.Ten);
    }
    public void Inchuvi()
    {
        System.out.println("Chu vi:"+this.Chuvi);
    }
    public void Indientich()
    {
        System.out.println("Dien tich:"+this.Dientich);
    }
    public void Inthetich()
    {
        System.out.println("The tich:"+this.Thetich);
    }
    
}
