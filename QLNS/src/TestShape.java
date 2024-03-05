public class TestShape {
    public static void main(String[] args){
        Shape a= new Shape();
        Circle b= new Circle(8);
        Square d= new Square(3);
        d.setSide(3);
        d.setLength(3);
        d.setWidth(3);
        Rectangle c= new Rectangle(3,5);
        double k= b.getArea();
        double h= b.getPerimeter();
        double m1= c.getArea();
        double m2 =c.getPerimeter();

        String s= b.toString();
        String s1= c.toString();
        String s2= d.toString();
        System.out.println(s+ " "+ k+" " + h);
        System.out.println(s1+" "+ m1+ " "+ m2);
        System.out.println(s2);

    }
}
