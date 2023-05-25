/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author Acer
 */
public class PhongThiNghiem extends PhongHoc{
    String bonrua,chuyennganh;
    int suchua;

    public PhongThiNghiem() {
    }

    public PhongThiNghiem(String chuyennganh,String bonrua, int suchua, String maphong, String daynha, double dientich, int sobongden) {
        super(maphong, daynha, dientich, sobongden);
        this.chuyennganh = chuyennganh;
        this.bonrua = bonrua;
        this.suchua = suchua;
    }

    public String getChuyennganh() {
        return chuyennganh;
    }

    public void setChuyennganh(String chuyennganh) {
        this.chuyennganh = chuyennganh;
    }

    public String getBonrua() {
        return bonrua;
    }

    public void setBonrua(String bonrua) {
        this.bonrua = bonrua;
    }

    public int getSuchua() {
        return suchua;
    }

    public void setSuchua(int suchua) {
        this.suchua = suchua;
    }
    
    public void Nhap()
    {
        System.out.print("Nhap ma phong:");
        maphong=sc.next();
        System.out.print("Nhap day nha:");
        daynha=sc.next();
        System.out.print("Nhap dien tich:");
        dientich=sc.nextDouble();
        System.out.print("Nhap so bong den:");  
        sobongden=sc.nextInt();
        System.out.print("Nhap chuyen nganh:"); 
        chuyennganh=sc.next();
        System.out.print("Nhap suc chua:");
        suchua=sc.nextInt();
        System.out.print("Co bon rua khong:"); 
        bonrua=sc.next();
    }
    public String check()
    {
        if(bonrua.equalsIgnoreCase("Co"))
            return "Co bon rua";
        return "khong co";
    }
}
