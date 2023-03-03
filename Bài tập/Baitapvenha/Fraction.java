/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitapvenha;

/**
 *
 * @author Acer
 */
public class Fraction {
    int Tuso;
    int Mauso;
    String string;
    public Fraction(int Tuso,int Mauso)
    {
        
    }
    public Fraction add(Fraction a)
    {
        Tuso+=a.Tuso;
        Mauso+=a.Mauso;
        return new Fraction(Tuso,Mauso);
    }
    public Fraction sub(Fraction a)
    {
        Tuso-=a.Tuso;
        Mauso-=a.Mauso;
        return new Fraction(Tuso,Mauso);
    }
    public Fraction mul(Fraction a){
        Tuso*=a.Tuso;
        Mauso*=a.Mauso;
        return new Fraction(Tuso,Mauso);
    }
    public Fraction div(Fraction a)
    {
        Tuso/=a.Tuso;
        Mauso/=a.Mauso;
        return new Fraction(Tuso,Mauso);
    }
   public void setString(String string)
    {
        this.string=string;
    }
    public String getString()
    {
        return string;  
    }
}
