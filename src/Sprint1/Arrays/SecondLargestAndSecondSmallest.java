package Sprint1.Arrays;

import java.util.Scanner;

public class SecondLargestAndSecondSmallest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = largest;
        int smallest =  Integer.MAX_VALUE;
        int secondSmallest = smallest;


        for(int i=0;i<n;i++) {

            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.println("2nd Largest= " + secondLargest + " 2nd Smallest= " + secondSmallest);
    }
}
