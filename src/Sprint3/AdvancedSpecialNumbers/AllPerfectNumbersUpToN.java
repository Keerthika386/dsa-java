package Sprint3.AdvancedSpecialNumbers;

import java.util.Scanner;

public class AllPerfectNumbersUpToN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=2;i<=n;i++){

            if(isPerfectNumber(i)){
                System.out.print(i + " ");
            }
        }


    }

    public static boolean isPerfectNumber(int num){

        int total = 1;

        for(int i=2;i<num;i++){

            if(num % i == 0){
                total += i;
            }
        }

        return  num == total ? true : false;

    }
}
