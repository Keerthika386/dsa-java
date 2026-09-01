package Sprint3.RecursionDeepDive;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciIterativeRecursiveMemoised {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //iterative

//        int tot =  0;
//        int a = 0;
//        int b = 1;
//
//        for(int i=2;i<=n;i++){
//            tot = a + b;
//            a = b;
//            b = tot;
//        }
//        System.out.println(tot);


        //recursive

//        int a = 0;
//        int b = 1;
//        int tot = 0;
//
//        if(n == 0){
//            System.out.println(0);
//            return;
//        }
//
//        if(n == 1){
//            System.out.println(1);
//            return;
//        }
//
//        System.out.println(fibonacci(a,b,n,0,tot));


        int a = 0;
        int b = 1;
        int tot = 0;

        if(n == 0){
            System.out.println(0);
            return;
        }

        if(n == 1){
            System.out.println(1);
            return;
        }
        int[] memo = new int[n+1];
        System.out.println(fibonacci(a,b,n,0,tot,memo));

    }
//    public static int  fibonacci(int a ,int b,int n,int index,int tot){
//
//        if(index >= n-1){
//            return tot;
//        }
//
//        tot = a + b;
//        return  fibonacci(b,tot,n,index+1,tot);
//    }


    public static int  fibonacci(int a ,int b,int n,int index,int tot,int[] memo){

//        if(index == n){
//            return tot;
//        }
        if( n == 0 ){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(memo[n] !=0){
            return  memo[n];
        }
        tot = fibonacci(a,b,n-1,index+1,tot,memo) + fibonacci(a,b,n-2,index+1,tot,memo);
        memo[n] = tot;
        return  tot;
    }

}
