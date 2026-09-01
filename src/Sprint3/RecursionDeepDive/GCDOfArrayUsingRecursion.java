package Sprint3.RecursionDeepDive;

import java.util.Scanner;

public class GCDOfArrayUsingRecursion {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

//        int sum = gcd(arr[0],arr[1]);
//        for(int i=2;i<arr.length;i++){
//            sum = gcd(arr[i],sum);
//        }
//        System.out.println(sum);
        int sum = gcd(arr[0],arr[1]);
        System.out.println(gcdrec(2,sum,arr));


    }
    public static int gcd(int n1,int n2){

        while(n1 > 0 && n2 > 0){

            if(n1 > n2){
                n1 = n1 % n2;
            }else{
                n2 = n2 % n1;
            }
        }
        return n1 == 0 ? n2 : n1;
    }

    public static int gcdrec(int index,int sum,int[] arr){

        if(index == arr.length){
            return sum;
        }
        sum = gcd(arr[index],sum);
        return gcdrec(index+1,sum,arr);

    }
}
