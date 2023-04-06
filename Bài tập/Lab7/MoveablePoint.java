/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class MoveablePoint implements Moveable{
    int x,y;
    int xSpeed,ySpeed;
    public  MoveablePoint(int x,int y,int xSpeed,int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
    }
    @Override
    public void moveUp()
    {
        y-=ySpeed;
    }
    @Override
    public void moveDown() 
    {
        y+=ySpeed;
    }

    @Override
    public void moveLeft() 
    {
        x-=xSpeed;
    }

    @Override
    public void moveRight() 
    {
        x+=xSpeed;
    }
    
}
