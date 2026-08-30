package Sprint3.RecursionDeepDive;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface GenerateAllPermutations {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        generatePermutations(arr,res,list,0);
        System.out.println(res);
    }

    public static void generatePermutations(int[] arr,List<List<Integer>> res,List<Integer> list,int index){

        if(index >= arr.length){
            List<Integer> permutation = new ArrayList<>();

            for (int x : arr) {
                permutation.add(x);
            }

            res.add(new ArrayList<>(permutation));
            return;
        }


        for(int i=index;i<arr.length;i++){

            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;


            generatePermutations(arr,res,list,index+1);


            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

        }

        
    }
}
