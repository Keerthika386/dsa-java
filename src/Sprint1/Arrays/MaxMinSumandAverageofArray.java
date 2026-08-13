package Sprint1.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinSumandAverageofArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        int sum = 0;


        for(int i=0;i<n;i++) {

            sum += arr[i];
            min = Math.min(arr[i],min);
            max = Math.max(arr[i],max);
        }
        double avg = (double) sum/n;

        System.out.println("Max= " + max + " Min= " + min +" Sum= " + sum +" Avg= " + avg);
    }

}
