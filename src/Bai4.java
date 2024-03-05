
import java.util.Scanner;


public class Bai4 {
    public static double tinhGiaithua(int n) {
        if (n > 0) {
            return n * tinhGiaithua(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int dem1=0;
        int dem2=0;
        int[] a={1,2};
        if( n<=2){
            System.out.println(n);;
        }
        int mod = n/2;
        long cnt =1;
        while(true){
            while(dem2< mod){
                if(sum <n){
                    sum+=a[1];
                }
                dem2++;
            }
            while(sum <n){
                sum+=a[0];
                dem1++;
            }
            int m = dem1+dem2;
            cnt+= Math.round(tinhGiaithua(m)/((tinhGiaithua(m-dem2)*tinhGiaithua(dem2))));
            if(sum ==n){
                dem2=0;
                mod--;
                sum=0;
                dem1=0;
            }
            if(mod ==0){
                break;
            }

        }
        System.out.println(cnt);




    }
}
