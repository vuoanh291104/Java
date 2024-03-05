import java.util.Random;

public class MyClass {
    private final  int soSV=40;
    private final int somay= new Random().nextInt(40);
    private  static  int id=0;


    class ClassManagement{

        public  void increase(){
            id++;
        }
        public void display(){
            System.out.println("id lop: "+ id +" So sinh vien: "+ soSV+ " So  may: "+ somay);
        }

    }


    public static void main(String[] args){
        MyClass.ClassManagement class1 = new MyClass().new ClassManagement();
        MyClass.ClassManagement class2= new MyClass().new ClassManagement();
        MyClass.ClassManagement class3= new MyClass().new ClassManagement();
        class1.increase();
        class1.display();
        class2.increase();
        class2.display();
        class3.increase();
        class3.display();

    }
}
