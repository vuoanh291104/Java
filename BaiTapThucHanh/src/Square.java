public class Square extends Rectangle{
    public Square() {
    }
    public Square(double side){
        super.setLength( side);
    }
    public Square(double side, String color, boolean filled){
        super(color,filled,side,side);
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    public  double getSide(){
        return super.getLength();
    }
    public void setWidth(double side){
        super.setWidth(side);
    }
    public void setLength(double side){
        super.setLength(side);
    }
    public String toString(){
        return "Square[ "+ super.toString();
    }
}
