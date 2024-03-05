import java.util.Scanner;

public class Bai3 {
    public static void Sort(int[] ar){
        for(int i=0; i< ar.length-1; i++){
            for(int j=i; j<ar.length ; j++){
                if(ar[j] < ar[i]){
                    int tmp =ar[i];
                    ar[i]=ar[j];
                    ar[j]=tmp;

                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        int[] a= new int[n];
        int[] b =new int[m];
        int j=0;
        int[] c= new int[m+n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();

        }
        for(int i=0; i<m; i++){
            b[i]=sc.nextInt();
        }
        Sort(a);
        Sort(b);
        for(int i: a){
            System.out.print(i+ " ");
        }
        System.out.println("\n");
        for(int i: b){
            System.out.print(i+ " ");
        }
        for(int i: a){
            c[j] = i;
            j++;
        }
        for(int i: b){
            c[j] =i;
            j++;
        }
        System.out.println("\n");
        Sort(c);
        for(int k: c){
            System.out.print(k+ " ");
        }


    }
}
