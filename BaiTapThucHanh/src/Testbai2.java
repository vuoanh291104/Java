import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Testbai2 {
    public static List<Object> Nhap(List<Object> list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Object la MovablePoint" +
                            "\n2.Object la MovableCircle ");

        int a=0;
        do{

            System.out.println("Choose: ");
            a = scanner.nextInt();
            scanner.nextLine();

            switch (a){

                case 1:
                    System.out.println("Nhap toa do x: ");
                    int x = scanner.nextInt();
                    System.out.println("Nhap toa do y: ");
                    int y = scanner.nextInt();
                    System.out.println("Nhap toa do xSpeed: ");
                    int xSpeed = scanner.nextInt();
                    System.out.println("Nhap toa do ySpeed: ");
                    int ySpeed = scanner.nextInt();
                    list.add(new MovablePoint(x,y,xSpeed,ySpeed));
                    break;

                case 2:
                    System.out.println("Nhap toa do x: ");
                    int x1 = scanner.nextInt();
                    System.out.println("Nhap toa do y: ");
                    int y1 = scanner.nextInt();
                    System.out.println("Nhap toa do xSpeed: ");
                    int xSpeed1 = scanner.nextInt();
                    System.out.println("Nhap toa do ySpeed: ");
                    int ySpeed1 = scanner.nextInt();
                    System.out.println("Nhap toa do radius: ");
                    double radius = scanner.nextDouble();
                    list.add(new MovableCircle(x1,y1,xSpeed1,ySpeed1,radius));
                default: break;


            }

        }while (a!=0);


        return list;

    }
    public static void Xoa(List<Object> list) {
        if (list.isEmpty()) return;
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (i == index) {
                list.remove(i);

            }
        }
    }
    public static void Sua(List<Object> list){
        Scanner scanner = new Scanner(System.in);
        if(list.isEmpty()) return;
        int index= scanner.nextInt();
        for(int i=0; i< list.size(); i++){
            if(i== index){
                Nhap(list);
            }
        }

    }
    public  static void luufile(File file,List<?> list){
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for(Object o : list){
                oos.writeObject(o);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<?> docfile(File file) {
        List<Object> list = new ArrayList<Object>();
        try {
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);

            while (true) {
                Object o = ois.readObject();
                if (o == null) break;
                list.add(o);
            }
            ois.close();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return  list;

    }
        public static void main (String[]args){
//            MovablePoint a = new MovablePoint(3, 4, 5, 2);
//            MovableCircle b = new MovableCircle(3, 4, 5, 2, 3.4);
//            a.moveLeft();
//            b.moveLeft();
//            System.out.println(b.toString());
            List<Object> list = new ArrayList<Object>();
            File f= new File("D:\\Javaaa\\BaiTapThucHanh\\src\\dataa1.bin");
            if(f.exists()){
                List<MovablePoint> p= (List<MovablePoint>)docfile(f);
                for(int i=0;i<p.size();i++){
                    MovablePoint point = p.get(i);
                    System.out.println(point.getX());
                }
            }else{
                Nhap(list);
                luufile(f,list);
            }

        }

    }