/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class ChuyenXe {
    public String Machuyenxe;
    public String Tentaixe;
    public String Soxe;
    public float Doanhthu;
    

    public ChuyenXe() {
    }

    public ChuyenXe(String Machuyenxe, String Tentaixe, String Soxe,float Doanhthu) {
        this.Machuyenxe = Machuyenxe;
        this.Tentaixe = Tentaixe;
        this.Soxe = Soxe;
        this.Doanhthu=Doanhthu;
    }

    public String getMachuyenxe() {
        return Machuyenxe;
    }

    public void setMachuyenxe(String Machuyenxe) {
        this.Machuyenxe = Machuyenxe;
    }

    public String getTentaixe() {
        return Tentaixe;
    }

    public void setTentaixe(String Tentaixe) {
        this.Tentaixe = Tentaixe;
    }

    public String getSoxe() {
        return Soxe;
    }

    public void setSoxe(String Soxe) {
        this.Soxe = Soxe;
    }

    public float getDoanhthu() {
        return Doanhthu;
    }
    
    public void setDoanhthu(float Doanhthu)
    {
        this.Doanhthu=Doanhthu;
    }

    @Override
    public String toString() {
        return "ChuyenXe{" + "Machuyenxe=" + Machuyenxe + ", Tentaixe=" + Tentaixe + ", Soxe=" + Soxe + ", Doanhthu=" + Doanhthu + '}';
    }
    
}
