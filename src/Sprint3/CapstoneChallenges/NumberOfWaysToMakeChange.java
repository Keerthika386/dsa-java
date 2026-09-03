package Sprint3.CapstoneChallenges;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfWaysToMakeChange {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter N");
        int amount = sc.nextInt();

        int[] ways = new int[amount+1];
        ways[0] = 1;

        for(int i=0;i<arr.length;i++){

            for(int j = arr[i]; j<= amount; j++){
                ways[j] += ways[j - arr[i]];
            }
        }
        System.out.println(ways[amount]);

    }
}
