import java.util.ArrayList;
import java.util.List;

public class Canh {
    private  int dinh;
    private double trongso;
    private List<Integer> dinhke;

    public Canh(int dinh) {
        this.dinh = dinh;
        this.trongso =Math.round(Math.random()*100)/100.0;
        dinhke = new ArrayList<>();

    }

    public int getDinh() {
        return dinh;
    }

    public void setDinh(int dinh) {
        this.dinh = dinh;
    }

    public double getTrongso() {
        return trongso;
    }
    public  void dsdinhke(int dinh){
        dinhke.add(dinh);
    }
    public String toString(){
        String s = dinh + "," + trongso + ",[";
        for(int i = 0;i<dinhke.size();i++) {
            s += dinhke.get(i) + "" ;
            if(i!=dinhke.size()-1) {
                s+=",";
            }
            else {
                s+="]";
            }

        }
        return s;
    }
}
