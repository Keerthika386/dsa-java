package Sprint1.LoopsAndPatterns;

import java.util.Scanner;

public class SumOfOddNumbersInRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = 0;

        // method 1
//        for (int i = A; i <= B; i++) {
//
//            if (i % 2 != 0) {
//                sum += i;
//            }
//        }
//
//        System.out.print(sum);

        // method 2

        int firstOdd = 0;
        sum = 0;
        for (int i = A; i <= B; i++) {

            if (i % 2 != 0) {
                firstOdd = i;
                break;
            }
        }
        if(firstOdd == 0){
            System.out.println(0);
            return;
        }
        for (int i = firstOdd; i <= B; i += 2) {

            sum +=i;
        }
        System.out.print(sum);
    }
}
