
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class AccountTest {
    ArrayList<Account> listAccountTest = new ArrayList<Account>();
    Scanner sc=new Scanner(System.in);
    Account A;
    int chon;
    public AccountTest()
    {
        super();
    }
    public void showmenu()
    {
        do{
        System.out.println("1.Them tai khoan");
        System.out.println("2.So tai khoan hien co trong ngan hang");
        System.out.println("3.In thong tin cac tai khoan");
        System.out.println("4.Nap tien");
        System.out.println("5.Rut tien");
        System.out.println("6.Chuyen tien");
        System.out.println("7.Dao han");
        System.out.println("8.Ket thuc");
        System.out.print("Chon 1 chuc nang:");
        chon=sc.nextInt();
        switch(chon)
        {
            case 1:{
                A=new Account();
                A.nhap();
                listAccountTest.add(A);
                System.out.println("Da tao tai khoan moi");
                System.out.println("-------------------------------------------------------------------------------------------------------------------------");
            }break;
            case 2:{
                System.out.println("So tai khoan trong ngan hang la:"+listAccountTest.size());
                System.out.println("-------------------------------------------------------------------------------------------------------------------------");
            }break;
            case 3:{
                System.out.format("%-30s %-30s %30s\n",
                        "So tai khoan",
                        "Ten tai khoan",
                        "So tien trong tai khoan");
                System.out.println("--------------------------------------------------------------------------------------------------------");
                for(Account A:listAccountTest)
                System.out.format("%-30s %-30s %30.2f\n",
                        A.getStk(),
                        A.getTentk(),
                        A.getTien());
                System.out.println("-------------------------------------------------------------------------------------------------------------------------");
            }break;
            case 4:
                A.naptien();
                break;
            case 5:
                A.ruttien();
                break;
            case 6:
                A.chuyentien();
                break;
            case 7:
                A.daohan();
                break;
            case 8:
            default:
            System.out.println("Da thoat");
        }
        }while(chon !=8);
    }
    
}
