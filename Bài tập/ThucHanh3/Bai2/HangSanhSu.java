/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class HangSanhSu extends HangHoa{
    String nhasanxuat;
    int ngaynhapkho;

    public HangSanhSu(String nhasanxuat, String mahang, String tenhang, double tonkho, double gia) {
        super(mahang, tenhang, tonkho, gia);
        this.nhasanxuat = nhasanxuat;
    }

    public String getNhasanxuat() {
        return nhasanxuat;
    }

    public void setNhasanxuat(String nhasanxuat) {
        this.nhasanxuat = nhasanxuat;
    }
    public boolean kiemtra()
    {
        int ngayhientai;
        ngayhientai=sc.nextInt();
        if(ngayhientai - ngaynhapkho >10)
            return true;
        return false;
    }
    @Override
    public  double VAT() 
    {
        double thue = gia * 0.1;
        return thue;
    }

    @Override
    public int mucdoban() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   
    
}
