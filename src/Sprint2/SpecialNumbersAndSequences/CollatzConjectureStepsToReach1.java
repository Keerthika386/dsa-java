package Sprint2.SpecialNumbersAndSequences;

import java.util.Scanner;

public class CollatzConjectureStepsToReach1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        while(n > 1){

            if(n % 2 == 0){
                 n /=2;
            }else{
                n = (n*3) + 1;
            }
            count++;
        }
        System.out.println(count);
    }
}
