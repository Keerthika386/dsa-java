package Sprint1.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayByKPositions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter K:");
        int k = sc.nextInt();

        k = k % n;

        reverse(0,n-1,arr);
        reverse(0,k-1,arr);
        reverse(k,n-1,arr);

        System.out.println(Arrays.toString(arr));
    }
    public  static void reverse(int start,int end,int[] arr){

        while(start < end){

            int temp = arr[start];
            arr[start] =  arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
