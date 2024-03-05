import java.io.Serializable;

public class Circle_bai4 implements  GeometricObject, Serializable {
    final double pi=3.14;
    protected double radius;

    public Circle_bai4(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[ " +
                "radius=" + radius +
                ']';
    }

    @Override
    public double getPerimeter() {
        return 2*pi*radius;
    }

    @Override
    public double getArea() {
        return radius*radius*pi;
    }
}
