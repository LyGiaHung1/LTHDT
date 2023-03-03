package Lab4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import Lab4.Hinhhoc;

/**
 *
 * @author Acer
 */
public class HinhChuNhat extends Hinhhoc {
    private float dai;
    private float rong;
    public HinhChuNhat() {
    }

    public float getDai() {
        return dai;
    }

    public void setDai(float dai) {
        this.dai = dai;
    }

    public float getRong() {
        return rong;
    }

    public void setRong(float rong) {
        this.rong = rong;
    }
    public void Nhapchieudai()
    {
        System.out.print("Nhap vao chieu dai:");
        dai=sc.nextFloat();
    }
    public void Nhapchieurong()
    {
        System.out.print("Nhap vao chieu rong:");
        rong=sc.nextFloat();
    }
    public void Tinhchuvi()
    {
        float CV=(dai+rong)*2;
        this.setChuvi(CV);
    }
    public void Tinhdientich()
    {
        float DT=dai*rong;
        this.setDientich(DT);
    }
}
