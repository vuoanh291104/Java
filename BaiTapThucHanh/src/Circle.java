public class Circle extends Shape{
    final double pi=3.14;
    private double radius=1.0;
    public Circle(){};

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

    @Override
    public double getArea() {
        return radius*radius*pi;
    }

    @Override
    public double getPerimeter() {
        return 2*pi*radius;
    }
    public String toString(){
        return "Circle[ " + super.toString()+ "radius= " +radius +"]";
    }
}
