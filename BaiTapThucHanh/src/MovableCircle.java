import java.io.Serializable;

public class MovableCircle implements Movable, Serializable {
    private double radius;
    MovablePoint center;

    public MovableCircle(){}
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, double radius){
        center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius=radius;
    }
    public String toString(){
        return center.toString()+ ",radius= "+ radius;
    }
    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

}
