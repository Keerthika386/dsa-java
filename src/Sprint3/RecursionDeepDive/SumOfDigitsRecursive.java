package Sprint3.RecursionDeepDive;

import java.util.Scanner;

public class SumOfDigitsRecursive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // iterative
//        int sum =0;
//        while(n > 0){
//            sum += n % 10;
//            n = n / 10;
//        }
//        System.out.println(sum);

        int sum = 0;

        if( n <= 9){
            System.out.println(n);
            return;
        }
        System.out.println(sumOfDigits(n));
    }
    public static int sumOfDigits(int n){

        if(n <= 0){
            return 0;
        }
        return  n % 10 + sumOfDigits(n/10);
    }
}
