package Sprint3.RecursionDeepDive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PowerSetCardinalityAndBitMask {
    public static void main(String[] args) {

        // when mask number is given
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        char[] arr = new char[n];
//
//        for(int i=0;i<n;i++){
//            arr[i] = sc.next().charAt(0);
//        }
//        System.out.println("Enter Mask Number");
//        int mask = sc.nextInt();
//
//        List<Integer> list = new ArrayList<>();
//        while(mask > 0){
//            list.add(mask % 2);
//            mask = mask / 2;
//        }
//        Collections.reverse(list);
//        System.out.print("Subset: {");
//        for(int i=0;i<list.size();i++){
//
//            if(list.get(i) == 1){
//                System.out.print(arr[i] + " ");
//            }
//        }
//
//        System.out.print("}");


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        List<Integer> res = new ArrayList<>();
        int end = (int) Math.pow(2,n);
        for(int i=0;i<end;i++){

            res = decimalToBinary(i,n);
            System.out.print("Subset: {");
            for(int j=0;j<res.size();j++){

                if(res.get(j) == 1){
                    System.out.print(arr[j] + " ");
                }

             }
            System.out.print("}");
            System.out.println();


        }
//        System.out.print("Subset: {");
//        for(int i=0;i<list.size();i++){
//
//            if(list.get(i) == 1){
//                System.out.print(arr[i] + " ");
//            }
//        }
//
//        System.out.print("}");

    }

    public static List<Integer> decimalToBinary(int num,int n){

        int count = 0;
        int sum  = 0;
        List<Integer> list = new ArrayList<>();

        while(count < n){
           // sum = (sum * 10) + num % 2;
            list.add(num % 2);
            num = num / 2;
            count++;
        }
        Collections.reverse(list);
        return list;

    }
}
