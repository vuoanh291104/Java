import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        switch (a){
            case 2:
                System.out.println("Thu 2");
                break;
            case 3:
                System.out.println("Thu 3");
                break;
            case 4:
                System.out.println("Thu 4");
                break;
            case 5:
                System.out.println("Thu 5");
                break;
            case 6:
                System.out.println("Thu 6");
                break;
            case 7:
                System.out.println("Thu 7");
                break;
            case 8:
                System.out.println("Chu nhat");
                break;
            default:
                System.out.println("khong la thu trong tuan");
        }
    }
}
