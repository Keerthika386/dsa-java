package Sprint1.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMissingNumberAndDuplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        long sum = 0;
        long squaresum = 0;


        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum +=arr[i];
            squaresum += arr[i] * arr[i];
        }

        long totsum =  n*(n+1)/2;
        long diff =  totsum - sum;
        long expectedSquareSum = (long) n * (n + 1) * (2 * n + 1) / 6;
        long squarediff = expectedSquareSum - squaresum;

        long diffM = squarediff / diff;
        long missed =  (diffM+ diff)/2;
        long duplicate = missed - diff;


        System.out.println("missed" +missed);
        System.out.println("duplicate" +duplicate);
    }
}
