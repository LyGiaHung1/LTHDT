/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class XeOto extends PhuongTienDichuyen{
    public String loaiNhienLieu;
    public XeOto(HangSanXuat  hangSanXuat,String loaiNhienLieu){
        super("Xe Oto",hangSanXuat);
        this.loaiNhienLieu=loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }
    
    @Override
    public double layVanToc() {
        return 120;
    }
    
}
