public class Testbai1 {
    public static void main(String[] args) {
        Circle a= new Circle("blue", true,3.0);
        Rectangle b= new Rectangle("yellow",true,2.0, 3.0);
        Square c= new Square(3.0," red", true);
        System.out.println(c.getArea());
        System.out.println(c.toString());
    }
}
