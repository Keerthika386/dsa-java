package Sprint2.SpecialNumbersAndSequences;

import java.util.Scanner;

public class AmicablePairFinder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 1;
        for(int i=2;i*i<=n;i++){
            if( n % i == 0){
                sum += i ;
            }

        }

        int sum2 = 1;

        for(int i=2;i*i<=sum;i++){
            if( sum % i == 0){
                sum2 += i ;
            }

        }

       if(sum2 == n){
           System.out.println("Amicable pair: (" + n + " , " + sum + ")" );
       }else{
           System.out.println("Not amicable");
       }
        System.out.println(sum);


    }
}
