import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws IOException {
        List<Canh> dsCanh= new ArrayList<Canh>();
        int i1=0, i2=0;
        try{
            FileReader file = new FileReader("D:\\Javaaa\\ThucHanh_xuli_vaora\\src\\data.txt");
            BufferedReader br = new BufferedReader(file);
            FileWriter fw = new FileWriter("D:\\Javaaa\\ThucHanh_xuli_vaora\\src\\datafull.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            String line = br.readLine();
            String[] s=line.split(" ");
            int u= Integer.parseInt(s[0]);
            int v=Integer.parseInt(s[1]);
            bw.write(u + " " + v);
            bw.newLine();
            for(int i=0;i<u;i++) {
                Canh a = new Canh(i);
                dsCanh.add(a);
            }

            line = br.readLine();
            while(line != null) {
                s = line.split(" ");
                i1 = Integer.parseInt(s[0]);
                i2 = Integer.parseInt(s[1]);
                Canh a = dsCanh.get(i1);
                a.dsdinhke(i2);
                Canh b = dsCanh.get(i2);
                b.dsdinhke(i1);
                bw.write(a.getDinh() + " " + a.getTrongso() + " "
                        + b.getDinh() + " " + b.getTrongso());
                bw.newLine();
                line = br.readLine();
            }

            bw.close(); file.close();
            br.close(); file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for(int i=0;i<dsCanh.size();i++) {
            System.out.println(dsCanh.get(i).toString());;
        }

    }
}