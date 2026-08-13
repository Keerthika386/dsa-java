package Sprint1.NumberTheoryFundamentals;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;

        if( N < 10){
            System.out.println(N);
            return;
        }
        while( N > 0){
            int digit = N % 10;
            result = (result * 10)+digit;
            N = N / 10;
        }
        System.out.println(result);
        sc.close();
    }
}
