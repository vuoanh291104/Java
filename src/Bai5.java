import java.util.Scanner;
import java.math.BigInteger;

public class Bai5 {
    static BigInteger tinhGiaithua(int val) {
        // Initialize result
        BigInteger f = BigInteger.ONE; // Or new BigInteger("1")
        // compute factorial
        for (int i = 2; i <= val; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }

        return f;
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
        BigInteger cnt = BigInteger.valueOf(1);
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
            //cnt=Math.round(cnt.add(tinhGiaithua(m).divide((tinhGiaithua(m-dem2).multiply(tinhGiaithua(dem2))))) ) ;
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
