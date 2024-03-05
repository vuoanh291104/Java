import java.io.Serializable;

public class MovablePoint implements Movable, Serializable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    public MovablePoint(){}

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public int getX() {
        return x;
    }
    public String toString(){
        return "(x,y) speed= (" + x+ ","+ y+")";
    }

    @Override
    public void moveUp() {
        y-=ySpeed;
    }

    @Override
    public void moveDown() {
        y+=ySpeed;
    }

    @Override
    public void moveLeft() {
        x-=xSpeed;
    }

    @Override
    public void moveRight() {
        x+=xSpeed;
    }
}
