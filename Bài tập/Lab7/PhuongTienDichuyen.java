/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
abstract class PhuongTienDichuyen {
    protected String loaiphuongtien;
    protected HangSanXuat hangSanXuat;

    public PhuongTienDichuyen(String loaiphuongtien, HangSanXuat hangSanXuat) {
        this.loaiphuongtien = loaiphuongtien;
        this.hangSanXuat = hangSanXuat;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getLoaiphuongtien() {
        return loaiphuongtien;
    }

    public void setLoaiphuongtien(String loaiphuongtien) {
        this.loaiphuongtien = loaiphuongtien;
    }
    public String laytenHangSanXuat(){
        return ""+hangSanXuat.getTenHangSanXuat();
    }
    public void batdau(){
        System.out.println("Bat dau di chuyen");}
    public void tangtoc(){
        System.out.println("Tang toc len");}
    public void dunglai(){
        System.out.println("Dung di chuyen");}
    abstract double layVanToc();
}
