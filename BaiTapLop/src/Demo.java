import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String args[]){
        Cat cat1= new Cat("Mimi",3,"Shiroi",5.4);
        Mouse  mouse1= new Mouse("Hana", 1.2);
        Duck duck1=new Duck("Satou", 8.4);
        RobotCat catrobo = new RobotCat("Mieko",2,"kuroi",3.4,"ma");
        Duck duck2= new Duck("Hanmu",8.0);
        List<Animal> list= new ArrayList<Animal>();
        list.add(cat1);
        list.add(catrobo);
        list.add(mouse1);
        list.add(duck1);
        list.add(duck2);
        for (Animal o: list){
            if( o instanceof  RobotCat){
                System.out.println("I'm robot");
                o.talk();
            } else if (o instanceof Mouse) {
                System.out.println("I'm mouse");
                o.talk();
            }else if(o instanceof Duck){
                System.out.println("I'm duck");
                o.talk();
            }else {
                System.out.println("I'm Cat");
                o.talk();
            }
        }
    }
}
