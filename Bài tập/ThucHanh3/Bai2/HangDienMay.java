/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author Acer
 */
public class HangDienMay extends HangHoa{
    int thoigianbaohang;
    double congsuat;

    
    public HangDienMay(int thoigianbaohang, double congsuat, String mahang, String tenhang, double tonkho, double gia) {
        super(mahang, tenhang, tonkho, gia);
        this.thoigianbaohang = thoigianbaohang;
        this.congsuat = congsuat;
    }
   

    public int getThoigianbaohang() {
        return thoigianbaohang;
    }

    public void setThoigianbaohang(int thoigianbaohang) {
        this.thoigianbaohang = thoigianbaohang;
    }

    public double getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(double congsuat) {
        this.congsuat = congsuat;
    }


    @Override
    public double VAT() 
    {
        double thue = gia * 0.1;
        return thue;
    }

    @Override
    public int mucdoban() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
