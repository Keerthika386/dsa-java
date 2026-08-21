package Sprint2.SpecialNumbersAndSequences;

import java.util.Scanner;

public class LychrelNumberChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        int k = 1;
        long sum = n + reverse(n);

        if(sum == reverse(sum)){
            System.out.println("Not Lychrel");
            return;
        }

        while( k < 50){

            long tot  = sum + reverse(sum);
            System.out.println("tot" + tot);
            if(tot == reverse(tot)){
                System.out.println("Not Lychrel");
                return;
            }
            sum = tot;
            k++;

        }
        System.out.println("Likely Lychrel");

//        long n = sc.nextLong();
//        long sum = n;
//
//        for (int k = 1; k <= 50; k++) {
//
//            sum = sum + reverse(sum);
//
//            if (sum == reverse(sum)) {
//                System.out.println("sum" + sum);
//                System.out.println("Not Lychrel");
//                return;
//            }
//        }
//
//        System.out.println("Likely Lychrel");
    }
    public static long reverse(long num){

        long reverse = 0;
        while(num > 0){

            long digit = num % 10;
            reverse = reverse * 10 + digit;
            num /=10;
        }
        return reverse;
    }
}
