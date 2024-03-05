import java.util.ArrayList;
import java.util.List;

public class Testbai2 {
    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<Object>();
        list1.add("HJSS");
        list1.add(1);
        list1.add(9.2f);
        for(Object s: list1){
            if(s instanceof String){
                System.out.println("String");
            } else if (s instanceof Integer) {
                System.out.println("Int");

            } else if (s instanceof Float) {
                System.out.println("Float");

            }
        }
    }

}
