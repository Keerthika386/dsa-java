package Sprint2.SievePrimeAlgorithms;

import java.util.Scanner;

public class SumOfDivisorsFrom1ToN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int tot = 0;

        for(int i=1;i<=n;i++){

//            totsum = 0;
//            for(int j=1;j<=i;j++){
//
//                if(i % j == 0){
//                    totsum += j;
//                }
//
//            }

//            sum +=totsum;

            tot +=  i * (n/i);

        }
        System.out.println(tot);
    }
}
