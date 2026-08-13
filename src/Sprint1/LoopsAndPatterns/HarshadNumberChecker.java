package Sprint1.LoopsAndPatterns;

import java.util.Scanner;

public class HarshadNumberChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int copy = N;
        int sum = 0;

        while(copy > 0){
            int digit = copy % 10;
            sum +=digit;
            copy = copy / 10;
        }
        System.out.println( N % sum == 0 ? "Harshad" : "Not Harshad");
    }
}
