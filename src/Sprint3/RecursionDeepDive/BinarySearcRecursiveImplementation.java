package Sprint3.RecursionDeepDive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BinarySearcRecursiveImplementation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target");
        int target = sc.nextInt();

        int start = 0;
        int end = arr.length;

        System.out.println(binarySearch(start,end,target,arr));
//        while(start < end){
//
//            int mid = start+((end-start)/2);
//            if(target < arr[mid]){
//                end = mid;
//            }else if(target > arr[mid]){
//                start = mid+1;
//            }else{
//                System.out.println(mid);
//                return;
//            }
//        }
//        System.out.println(-1);


    }

    public static int binarySearch(int start,int end,int target,int[] arr){

        if(start >= end){
            return -1;
        }
        int mid = start+((end-start)/2);
        if(arr[mid] == target){
            return mid;
        }
        if(target < arr[mid]){
                return binarySearch(start,mid,target,arr);
        }else if(target > arr[mid]){
            return binarySearch(mid+1,end,target,arr);
        }
        return -1;
    }
}
