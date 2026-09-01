package Sprint3.AdvancedSpecialNumbers;

import java.util.Scanner;

public class CheckNarcissisticNumbersAllDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int start = (int) Math.pow(10,n-1);
        int end =  (int) Math.pow(10,n);


        for(int i=start;i< end;i++){

            if(i == armstrong(i)){
                System.out.print(i + " ");
            }
        }

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

}
