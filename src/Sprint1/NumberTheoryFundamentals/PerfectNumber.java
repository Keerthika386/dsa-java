package Sprint1.NumberTheoryFundamentals;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int total = 1;

        if(N <= 1){
            System.out.println("Not Perfect");
            return;
        }
        for(int i=2;i<N;i++){

            if(N % i ==0){
                total += i;
            }
        }
        System.out.println(N == total ? "Perfect" : "Not Perfect" );
    }
}
