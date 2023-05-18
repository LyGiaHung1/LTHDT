/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Acer
 */
public class HangThucPham extends HangHoa{
    String nhacungcap;
    LocalDate ngaysanxuat = LocalDate.now();
    LocalDate ngayhethan = LocalDate.of(2023, 05, 20);
    
    public HangThucPham(String mahang,String tenhang,double tonkho,double gia,String nhacungcap,LocalDate ngaysanxuat,LocalDate ngayhethan) {
        super(mahang,tenhang,tonkho,gia);
        this.ngaysanxuat=ngaysanxuat;
        this.ngayhethan=ngayhethan;
        this.nhacungcap = nhacungcap;
    }

    public String getNhacungcap() {
        return nhacungcap;
    }

    public void setNhacungcap(String nhacungcap) {
        this.nhacungcap = nhacungcap;
    }

    public LocalDate getNgaysanxuat() {
        return ngaysanxuat;
    }

    public void setNgaysanxuat(LocalDate ngaysanxuat) {
        this.ngaysanxuat = ngaysanxuat;
    }

    public LocalDate getNgayhethan() {
        return ngayhethan;
    }

    public void setNgayhethan(LocalDate ngayhethan) {
        this.ngayhethan = ngayhethan;
    }

    public String Ngaysanxuat()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String nsx = dtf.format(ngaysanxuat);
        return "Ngay san xuat:"+nsx;
    }
    public String Ngayhethan()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String nhh = dtf.format(ngayhethan);
        return "Ngay san xuat:"+nhh;
    }
    public boolean hethan()
    {
        return ngayhethan.isBefore(LocalDate.now())?true: false;
    }
    @Override
    public double VAT() {
        double thue =  gia * 0.05;
        return thue;
    }

    @Override
    public int mucdoban() {
        if(tonkho > 0 && hethan()==true)
            return 1;
        return -1;
    }
    
}
