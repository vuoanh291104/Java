public class Circle extends Shape{
    final double PI=3.14;
    private double radius=1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*PI*radius;
    }
    public String toString(){
        return "Circle[ "+ super.toString()+", radius= "+ radius+"]";
    }
}
