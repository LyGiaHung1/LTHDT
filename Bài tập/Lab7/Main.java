/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Main {
    public static void main(String[] args) {
        Moveable m=new MoveablePoint(5, 6, 3, 5);
        System.out.println(m);
        m.moveLeft();
        System.out.println(m);
        Moveable m1=new MoveableCircle(new MoveablePoint(7, 5, 8, 12), 5);
        System.out.println(m1);
        m1.moveUp();
        System.out.println(m1);

    }
}
