package Sprint1.NumberTheoryFundamentals;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int copy = N;
        int result = 0;

        int count = (int) (Math.log10(N) +1);

        if(N < 10){
            System.out.println("Armstrong");
            return;
        }
        while( N > 0){
            int digit = N % 10;
            result += Math.pow(digit,count);
            N = N / 10;
        }

        System.out.println(copy == result ? "Armstrong" : "Not Armstrong" );

        sc.close();
    }
}
