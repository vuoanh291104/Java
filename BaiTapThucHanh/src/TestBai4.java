import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestBai4 {
    public static void luuFile(File file,List<Object> list){
        try{
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for(Object o : list){
                oos.writeObject(o);
            }
            oos.flush();
            oos.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
    public static List<?> docfile(File file){
        List<Object> list = new ArrayList<Object>();

        try{
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            while(true){
                Object o = ois.readObject();
                if(o==null) break;
                list.add(o);
            }
            ois.close();
        }
        catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    public static void main(String[] args) {
//        Circle_bai4 a =new Circle_bai4(3.4);
//        ResizableCircle b =new ResizableCircle(3.4);
//        Circle_bai4 c =new Circle_bai4(8.9);
//        ResizableCircle d =new ResizableCircle(9.2);
        //List<Object> list = new ArrayList<Object>();

//        list.add(a);
//        list.add(b);
//        list.add(c);
//        list.add(d);
        File f = new File("D:\\Javaaa\\BaiTapThucHanh\\src\\data.bin");
//        luuFile(f, list);

        List<Circle_bai4> list= (List<Circle_bai4>) docfile(f);
        for(int i=0; i<list.size(); i++){
            Circle_bai4 c= list.get(i);
            System.out.println(c.getArea());
        }



    }
}
