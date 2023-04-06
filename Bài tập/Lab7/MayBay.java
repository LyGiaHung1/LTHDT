/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class MayBay extends PhuongTienDichuyen{
    public String loaiNhienLieu;

    public MayBay(HangSanXuat  hangSanXuat,String loaiNhienLieu) {
        super("May bay",hangSanXuat);
        this.loaiNhienLieu=loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }
    
    public void catCanh(){
        System.out.println("Cat canh");
    }
    public void haCanh(){
        System.out.println("Ha canh");
    }
    @Override
    public double layVanToc() {
        
        return 500;
        
    } 
    
}
