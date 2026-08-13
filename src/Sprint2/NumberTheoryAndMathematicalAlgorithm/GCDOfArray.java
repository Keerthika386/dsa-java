package Sprint2.NumberTheoryAndMathematicalAlgorithm;

import java.util.*;

public class GCDOfArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int gcd = arr[0];
        for(int i=1;i<n;i++){
            gcd = GCD(gcd,arr[i]);
        }
        System.out.println("GCD=" + gcd);
    }

    public static int GCD(int n1,int n2) {

        while (n1 > 0 && n2 > 0) {

            if( n1 > n2){
                n1 = n1 % n2;

            }else{
                n2 = n2 % n1;
            }
        }
        return  n1 == 0 ? n2 : n1;
    }
}
