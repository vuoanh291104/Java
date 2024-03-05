import java.util.Objects;
import java.util.Scanner;

public class SoPhuc {
    private float pt;
    private  float pa;

    public SoPhuc() {
        this.pt=0;
        this.pa=0;
    }

    public SoPhuc(float pt, float pa) {
        this.pt = pt;
        this.pa = pa;
    }

    public float getPt() {
        return pt;
    }

    public void setPt(float pt) {
        this.pt = pt;
    }

    public float getPa() {
        return pa;
    }

    public void setPa(float pa) {
        this.pa = pa;
    }

    public  static  SoPhuc cong(SoPhuc a, SoPhuc b){
        SoPhuc tong = new SoPhuc();
        a.in();
        b.in();
        tong.pt= a.pt + b.pt;
        tong.pa = a.pa + b.pa;
        return tong;
    }
    public static SoPhuc hieu(SoPhuc a, SoPhuc b){
        SoPhuc hieu = new SoPhuc();
        hieu.pt= a.pt + b.pt;
        hieu.pa= a.pa + b.pa;
        return hieu;
    }
    public static SoPhuc chia(SoPhuc a, SoPhuc b){
        SoPhuc chia =new SoPhuc();
        chia.pt= (float) (((a.pt * b.pt) + (a.pa * b.pa)) / (Math.pow(b.pt, 2) + Math.pow(b.pa, 2)));
        chia.pa = (float) ((a.pa*b.pt - a.pt*b.pa) / (Math.pow(b.pt, 2) + Math.pow(b.pa, 2)));
        return  chia;
    }
    public static SoPhuc nghichdao(SoPhuc a){
        SoPhuc mot = new SoPhuc(1,1);
        SoPhuc nghich= new SoPhuc();
        nghich = chia(mot,a);
        return  nghich;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoPhuc soPhuc = (SoPhuc) o;
        return Float.compare(pt, soPhuc.pt) == 0 && Float.compare(pa, soPhuc.pa) == 0;
    }
    public static boolean nhohon(SoPhuc a, SoPhuc b){
        float moduna= (float) Math.sqrt( Math.pow(a.pt,2)+ Math.pow(a.pa,2));
        float modunb= (float) Math.sqrt( Math.pow(b.pt,2)+  Math.pow(b.pa,2));
        if( moduna < modunb) return true;
        else return  false;


    }
    public static boolean lonhon(SoPhuc a, SoPhuc b){
        float moduna= (float) Math.sqrt( Math.pow(a.pt,2)+ Math.pow(a.pa,2));
        float modunb= (float) Math.sqrt( Math.pow(b.pt,2)+  Math.pow(b.pa,2));
        if( moduna > modunb) return true;
        else return  false;
    }
    public void  nhap(){
        Scanner sc= new Scanner(System.in);
        float a = sc.nextFloat();
        float b= sc.nextFloat();
        this.setPt(a);
        this.setPa(b);
    }
    public void in(){
        System.out.println(this.pt + " + " + this.pa+"i");
    }
    public static  void main(String[] args){
        SoPhuc a= new SoPhuc();
        SoPhuc b= new SoPhuc();
        a.nhap();
        b.nhap();
        SoPhuc tong = cong(a,b);
        tong.in();
        SoPhuc hieu= hieu(a,b);
        hieu.in();
        SoPhuc chia= chia(a,b);
        chia.in();
        SoPhuc anghich= nghichdao(a);
        a.in();
        SoPhuc bnghich= nghichdao(b);
        b.in();
        System.out.println(a.equals(b));
        nhohon(a,b);
        lonhon(a,b);


    }

}
