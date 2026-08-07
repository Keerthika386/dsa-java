package BasicMathAndArithmetic;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if( N <=1){
            System.out.println("Not Prime");
            return;
        }
        for(int i=2; i*i <= N; i++){

            if( N % i == 0){
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");

    }
}
