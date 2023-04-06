
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
class MoveableCircle implements Moveable {
    int radius;
    public MoveablePoint center;
    public MoveableCircle(MoveablePoint point,int radius)
    {
        this.center = point;
        this.radius=radius;
    } 

    @Override
    public String toString() {
        return "MoveableCircle{" + "radius=" + radius + ", center=" + center + '}';
    }

   
    
    @Override
    public void moveDown() {
        center.y+=center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x-=center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x+=center.xSpeed;
    }

    @Override
    public void moveUp() {
        center.y-=center.ySpeed;
    }
    
}
