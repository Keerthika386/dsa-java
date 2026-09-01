package Sprint3.AdvancedSpecialNumbers;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];


        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

//        int[] prefixProducts = new int[n];
//        int[] suffixProducts = new int[n];
//
//        int prefixSum = 1;
//        int suffixSum = 1;
//
//        for(int i=0;i<n;i++){
//
//            prefixProducts[i] = prefixSum;
//            suffixProducts[n-i-1] = suffixSum;
//            prefixSum *= arr[i];
//            suffixSum *= arr[n-i-1];
//
//        }
//
//        for(int i=0;i<n;i++){
//            System.out.print(prefixProducts[i] * suffixProducts[i] + " ");
//        }


        int[] res = new int[n];


        int prefixSum = 1;
        int suffixSum = 1;

        for(int i=0;i<n;i++){
            res[i] = prefixSum;
            prefixSum *= arr[i];

        }

        for(int i=n-1;i>=0;i--){

            res[i] =  suffixSum * res[i];
            suffixSum *= arr[i];

        }

        System.out.println(Arrays.toString(res));



    }
}
