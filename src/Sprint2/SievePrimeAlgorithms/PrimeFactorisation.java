package Sprint2.SievePrimeAlgorithms;

import java.util.Scanner;

public class PrimeFactorisation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while( n % 2 == 0){
            n = n/2;
            System.out.print(2 + " * ");
        }


        if( n <= 3){
            System.out.print(n);
            return;
        }

        for(int i = 3;i<n;i=i+2){

            if(n % i == 0){

                while(n % i == 0 &&  n > 1){
                    n = n/i;
                    System.out.print(i + " * ");
                }
            }
        }

        if(n > 1){
            System.out.println(n);

        }

    }
}
