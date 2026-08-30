package Sprint3.RecursionDeepDive;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateAllSubsetsOfASet {
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

        generateSubsets(arr,res,list,0);
        System.out.println(res);

    }

    public static void generateSubsets(int[] arr,List<List<Integer>> res,List<Integer> list,int index){

        if(index >= arr.length){
            res.add(new ArrayList<>(list));
            return;
        }

        list.add(arr[index]);
        generateSubsets(arr,res,list,index+1);
        list.remove(list.size()-1);
        generateSubsets(arr,res,list,index+1);


    }
}
