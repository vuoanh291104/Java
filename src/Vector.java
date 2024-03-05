

import java.util.Scanner;

public class Vector {
    private float[] toaDo;
    private int n;
    public Vector() {}
    public Vector(int n) {
        this.n = n;
        if(n<1) {
            System.out.println("Khoi tao that bai! (Khong gian > 0).");
        }else {
            toaDo = new float[n];
        }
    }
    public void setValue(int index, float value) {
        if(index<0||index>=toaDo.length) {
            System.out.println("Index khong thoa man.");
        }else {
            toaDo[index] = value;
        }
    }
    public float getValue(int index) {
        return toaDo[index];
    }
    public int getSoLuongThanhPhan() {
        return n;
    }
    public void cong(Vector x) {
        if(x.getSoLuongThanhPhan() != n) {
            System.out.println("hai vector khong cung khong gian");
        }else {
            for(int i=0;i<x.getSoLuongThanhPhan();i++) {
                toaDo[i] = x.getValue(i)+toaDo[i];
            }
        }
    }
    public void hieu(Vector x) {
        if(x.getSoLuongThanhPhan() != n) {
            System.out.println("2 vector khong cung khong gian");
        }else {
            Vector tmp = new Vector(x.getSoLuongThanhPhan());
            for(int i=0;i<x.getSoLuongThanhPhan();i++) {
                toaDo[i] = toaDo[i] - x.getValue(i);
            }
        }
    }
    public float tichVoHuong(Vector x) {
        float kq = 0;
        for(int i=0;i<n;i++) {
            kq += x.getValue(i)*toaDo[i];
        }
        return kq;
    }
    public void tich(float value) {
        for(int i=0;i<n;i++) {
            toaDo[i] = toaDo[i] * value;
        }
    }
    public float doDai() {
        float kq = 0;
        for(int i=0;i<n;i++) {
            kq += toaDo[i] * toaDo[i];
        }
        if(kq == 0) {
            return 0;
        }else
            return (float)Math.sqrt(kq);
    }
    public void chuanHoa() {
        float TB = this.doDai();
        for(int i=0;i<n;i++) {
            toaDo[i] /= TB;
        }
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap toa do cho vector:");
        for(int i=0;i<n;i++) {
            toaDo[i] = Float.parseFloat(sc.next());
        }
    }
    public void print() {
        System.out.print("Vector co toa do: (");
        for(int i=0;i<n;i++) {
            System.out.print(toaDo[i]);
            if(i<n-1) System.out.print(", ");
        }
        System.out.println(")");
    }
    public boolean congTuyen(Vector x) {
        float k = toaDo[0] / x.getValue(0);
        for(int i=1;i<n;i++) {
            if(toaDo[i]/x.getValue(i)!=k) {
                return false;
            }
        }
        return true;
    }
    public boolean vuongGoc(Vector x) {
        float d = this.tichVoHuong(x);
        return d == 0? true:false;
    }
    public static void main(String[] args) {
        Vector a = new Vector(3);
        Vector b = new Vector(3);
        a.nhap();
        b.nhap();
        a.print();
        b.print();
        System.out.println("2 vector cong tuyen: " + a.congTuyen(b));
        System.out.println("2 vector vuong goc: " + a.vuongGoc(b));
    }
}
