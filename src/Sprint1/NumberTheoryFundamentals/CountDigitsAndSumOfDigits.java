package Sprint1.NumberTheoryFundamentals;

import java.util.Scanner;

public class CountDigitsAndSumOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int sum = 0;

        while( N > 0){
            int digit = N % 10;
            sum += digit;
            N = N / 10;
            count++;
        }
        System.out.println("Count=" +count + ", Sum=" +sum);
    }
}
