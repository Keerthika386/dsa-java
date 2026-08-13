package Sprint1.ConditionalsAndLogic;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.print(1 + " ");
        System.out.print(2 + " ");

        for(int i=3; i<=N;i++){

            if( i % 3 ==0 && i % 5 ==0){
                System.out.print("FizzBuzz ");
            }else if( i % 3 == 0){
                System.out.print("Fizz ");
            }else if(i % 5 == 0){
                System.out.print("Buzz ");
            }else{
                System.out.print(i + " ");
            }

        }

    }
}
