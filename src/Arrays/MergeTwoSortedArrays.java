package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of first array :");
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        System.out.println("Enter first array elements :");

        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter length of second array :");
        int n1 = sc.nextInt();
        int[] arr2 = new int[n1];

        System.out.println("Enter second array elements :");

        for(int i=0;i<n1;i++){
            arr2[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();

        int p1 = 0;
        int p2 = 0;

        while(p1 < n && p2 <n1){

            if(arr1[p1] <= arr2[p2]){

                list.add(arr1[p1]);
                p1++;

            }else{
                list.add(arr2[p2]);
                p2++;
            }
        }

        while(p1 < n){

            list.add(arr1[p1]);
            p1++;
        }
        while(p2 < n1){

            list.add(arr2[p2]);
            p2++;
        }
        int[] res = new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }
        System.out.println(Arrays.toString(res));
    }
}
