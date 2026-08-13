package Sprint1.NumberTheoryFundamentals;

import java.util.Scanner;

public class FindAllDivisorOfNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

//        int tot = 0;
//
//        for(int i=1;i*i<=N;i++){
//
//            if( N % i == 0){
//                System.out.print(i + " ");
//
//                System.out.print(N/i + " ");
//            }
//        }
        findDivisor(1,N);
    }
    public  static void findDivisor(int start ,int N){


        if(start * start > N){
            return;
        }

        if( N % start == 0){
                System.out.print(start + " ");
        }
        findDivisor(start+1,N);

        if(!(start == N / start) && N % start == 0) {
            System.out.print(N / start + " ");
        }

    }
}
