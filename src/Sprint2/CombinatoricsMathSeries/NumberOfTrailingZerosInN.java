package Sprint2.CombinatoricsMathSeries;

import java.util.Scanner;

public class NumberOfTrailingZerosInN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int divide = 5;

        int quotient = n / divide;
        int cnt = 0;

        while(quotient > 0 ){

            cnt += quotient;
            divide *= 5;
            quotient = n / divide;

        }
        System.out.println(cnt);

    }
}
