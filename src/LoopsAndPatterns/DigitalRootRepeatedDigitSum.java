package LoopsAndPatterns;

import java.util.Scanner;

public class DigitalRootRepeatedDigitSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = N;
        int totsum = 0;

        if(N <= 9){
            System.out.println(N);
            return;
        }

        //method1
//        while( N > 0){
//
//            totsum = 0;
//            while(N > 0) {
//                int digit = N % 10;
//                totsum += digit;
//                N = N / 10;
//            }
//            N = totsum;
//            if( N <=9){
//                System.out.println(N);
//                return;
//            }
//
//        }

        //method2
        if(N % 9 ==0){
            System.out.println(9);
            return;
        }
        System.out.println( N % 9);
    }
}
