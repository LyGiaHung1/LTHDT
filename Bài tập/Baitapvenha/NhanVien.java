/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitapvenha;

/**
 *
 * @author Acer
 */
public class NhanVien {
    String tenNhanVien;
    double luongcoban;  
    double hesoluong;
    double luongmax;
    double luong;
public double luong()
{
    return luong=(double)(luongcoban*hesoluong);
}
public void luong(double luong)
{
    this.luong=luong;
}
public void setluongcoban(double luongcoban)
{
    this.luongcoban=luongcoban;
}
public double getluongcoban()
{
    return luongcoban;
}
public void settenNhanVien(String tenNhanVien)
{
    this.tenNhanVien=tenNhanVien;
}
public String gettenNhanVien()
{
    return tenNhanVien;
}
public void sethesoluong(double hesoluong)
{
    this.hesoluong=hesoluong;
}
public double gethesoluong()
{
    return hesoluong;
}
public void setluongmax(double luongmax)
{
    this.luongmax=luongmax;
}
public double getluongmax()
{
    return luongmax;
}
public boolean tangluong()
{
        boolean tangluong = true;
        boolean khongtangluong = false;
        return false;
}
}
