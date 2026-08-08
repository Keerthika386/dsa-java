package LoopsAndPatterns;

import java.util.Scanner;

public class PrintPrimesinaRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        boolean flag = false;

        for(int i= A;i<=B;i++){

            if(isPrime(i)){
                flag = true;
                System.out.print(i + " ");
            }
        }
        if(!flag){
            System.out.print("None");
        }
    }

    public static boolean isPrime(int N){

        if(N <=1){
            return false;
        }
        for(int i=2;i*i<=N;i++){

            if( N % i == 0){
                return false;
            }
        }
        return true;
    }
}
