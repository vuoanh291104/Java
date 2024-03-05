import java.io.Serializable;

public class ResizableCircle extends Circle_bai4 implements Resizable, Serializable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle[Circle[radius=" + radius +
                "]]";
    }

    @Override
    public void resize(int percent) {
        radius*= (double) percent/100.0;
    }

}
