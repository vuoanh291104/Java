public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;
    public MovablePoint(){
        xSpeed=0;
        ySpeed=0;
    }
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] arr1= new float[2];
        arr1[0]= xSpeed;
        arr1[1]=ySpeed;
        return arr1;
    }

    @Override
    public String toString() {
        return "(" + getX() +","+ getY()+")" + " speed "+"("+ xSpeed +","+ ySpeed +")";
    }
    public MovablePoint move(){
        System.out.println(" sau move: ");
        setxSpeed(getX()+xSpeed);
        setySpeed(getY()+ySpeed);

        return this;

    }
}
