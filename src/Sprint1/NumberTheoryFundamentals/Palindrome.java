package Sprint1.NumberTheoryFundamentals;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int reverse = reverse(N);
        System.out.println(N == reverse ? "Palindrome" : "Not Palindrome");
        sc.close();
    }

    public static int reverse(int N) {


        int result = 0;

        if( N < 10){
            return N;
        }
        while( N > 0){
            int digit = N % 10;
            result = (result * 10)+digit;
            N = N / 10;
        }
       return  result;

    }
}
