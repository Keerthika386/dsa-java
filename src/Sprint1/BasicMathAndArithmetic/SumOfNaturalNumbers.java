package Sprint1.BasicMathAndArithmetic;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N < 0){
            System.out.println("Enter a Valid number");
            return;
        }

        System.out.println("Using for loop");
        forLoop(N);

        System.out.println("Using while loop");
        whileLoop(N);

        System.out.println("Using formula");
        usingFormula(N);

    }

    public static void forLoop(int N) {

        int sum = 0;
        for(int i =1;i<=N;i++){

            sum += i;
        }
        System.out.println(sum);
    }

    public static void whileLoop(int N) {

        int sum = 0;
        int i =0;

        while(i <= N) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }


    public static void usingFormula(int N) {

        int sum = N*(N+1)/2;
        System.out.println(sum);
    }
}
