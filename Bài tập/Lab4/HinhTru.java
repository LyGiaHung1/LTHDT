package Lab4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import Lab4.HinhTron;

/**
 *
 * @author Acer
 */
public class HinhTru extends HinhTron {
    private float cao;

    public HinhTru() {
    }

    public float getCao() {
        return cao;
    }

    public void setCao(float cao) {
        this.cao = cao;
    }
    public void Nhapvaocao()
    {
        System.out.print("Nhap vao chieu cao:");
        cao=sc.nextFloat();
    }
    public void Tinhthetich()
    {
        float TT=cao*this.PI*this.Bankinh*this.Bankinh;
        this.setThetich(TT);
        
    }
}
