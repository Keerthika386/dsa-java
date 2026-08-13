package Sprint2.SievePrimeAlgorithms;

import java.util.Scanner;

public class SieveAllPrimesUpToN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean[] arr = new boolean[n+1];

        for(int i=0;i<arr.length;i++){

            arr[i] = true;
        }

        for(int i=2;i*i<=n;i++){

            if(arr[i]) {
                for (int j = i*i; j <= n; j++) {

                    if (j % i == 0) {
                        arr[j] = false;
                    }
                }
            }
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i]){
                System.out.print(i + " ");
            }
        }

    }


}
