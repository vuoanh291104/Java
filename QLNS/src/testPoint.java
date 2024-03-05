public class testPoint {
    public static void main(String[] args){
        Point a= new Point(1,9);
        MovablePoint b= new MovablePoint(8,7);
        //String s= b.toString();
        MovablePoint k= b.move();
        String s= k.toString();
        System.out.println(s);


    }
}
