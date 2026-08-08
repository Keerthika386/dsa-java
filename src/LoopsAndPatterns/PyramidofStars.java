package LoopsAndPatterns;

import java.util.Scanner;

public class PyramidofStars {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1;i<=N;i++){

            for(int space=1;space<=N-i;space++){
                System.out.print(" ");
            }

            for(int j=1;j<=i*2-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
