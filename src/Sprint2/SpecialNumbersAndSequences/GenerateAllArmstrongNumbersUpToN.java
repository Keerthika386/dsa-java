package Sprint2.SpecialNumbersAndSequences;

import java.util.Scanner;

public class GenerateAllArmstrongNumbersUpToN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){

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
