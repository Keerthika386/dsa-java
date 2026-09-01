package Sprint3.AdvancedSpecialNumbers;

import java.util.Arrays;
import java.util.Scanner;

public class SieveWithSmallestPrimeFactor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorise = sc.nextInt();

        boolean[] arr = new boolean[n+1];

        int[] spf = new int[n+1];
        spf[0] = 1;
        spf[1] = 1;


        for(int i=0;i<arr.length;i++){

            arr[i] = true;
        }

        for(int i=2;i<=n;i++){

            for (int j = i; j <= n; j++) {

                if (j % i == 0) {
                    if(spf[j] == 0){
                        spf[j]  = i;
                    }else{
                        spf[j] = Math.min(spf[j],i);
                    }
                    arr[j] = false;
                }

            }
        }

        int copyfac = factorise;

        while(copyfac > 1){
            int rem = copyfac / spf[copyfac];
            System.out.print(spf[copyfac] + " ");
            copyfac = rem;
        }


//        for(int i=2;i<arr.length;i++){
//            if(arr[i]){
//                System.out.print(i + " ");
//            }
//        }

    }
}
