package Lab4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import Lab4.Hinhhoc;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class HinhTron extends Hinhhoc {
    public float Bankinh;

    public HinhTron() {
    }

    public float getBankinh() {
        return Bankinh;
    }

    public void setBankinh(float Bankinh) {
        this.Bankinh = Bankinh;
    }
    public void Nhapbankinh()
    {      
        System.out.print("Nhap vao ban kinh:");
        Bankinh=sc.nextFloat();
    }
    public void Tinhchuvi()
    {
        float CV=Bankinh*2*PI;
        this.setChuvi(CV);
    }
    public void Tinhdientich()
    {
        float DT=Bankinh*Bankinh*PI;
        this.setDientich(DT);
    }
    
}
