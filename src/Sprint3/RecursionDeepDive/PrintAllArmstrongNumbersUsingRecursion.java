package Sprint3.RecursionDeepDive;

import java.util.Scanner;

public class PrintAllArmstrongNumbersUsingRecursion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        armstrongNumberCreation(1,n);

    }

    public static int armstrong(int num){

        int count = (int) (Math.log10(num) +1);

        if(num < 10){
            return num;
        }

        int result = 0;
        while( num > 0){
            int digit = num % 10;
            result += Math.pow(digit,count);
            num = num / 10;
        }

        return result;

    }

    public static void armstrongNumberCreation(int num,int n){

        if(num > n){
            return;
        }
        if( num == armstrong(num)){
            System.out.print(num + " ");
        }
        armstrongNumberCreation(num+1,n);
    }

}
