package Sprint1.BasicMathAndArithmetic;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        factorial(N);
        findSmallestfactor(N);

    }
    public static void factorial(int N){

        int factorial = 1;
        for(int i=1;i<=N;i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }

    public static void findSmallestfactor(int N){

        int i = 2;

        while(i <= N){
            if( N % i == 0){

                System.out.println("Factor " +i);
                if( i == N){
                    System.out.println("Prime");
                    break;
                }
                break;
            }
            i++;
        }
    }
}
