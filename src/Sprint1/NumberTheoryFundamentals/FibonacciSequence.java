package Sprint1.NumberTheoryFundamentals;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int a = 0;
        int b = 1;

        if(N <= 0){
            return;
        }
        if( N == 1){
            System.out.print(0);
            return;

        }
        System.out.print(a + " ");
        System.out.print(b   + " ");
        for(int i =2;i<N;i++){

            int fibo = a+b;
            System.out.print( fibo + " ");
            a = b;
            b = fibo;
        }
    }
}
