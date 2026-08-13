package Sprint1.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindAllPrimesInArrayAndTheirSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if(isPrime(arr[i])){
                sum +=arr[i];
                list.add(arr[i]);

            }
        }

        int[] res = new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }
        System.out.println("Primes=" + Arrays.toString(res) +  " Sum= " + sum);


    }

    public static boolean isPrime(int num) {

        if(num <= 1){
            return  false;
        }
        for(int i=2;i*i<=num;i++){

            if( num % i == 0){
                return false;
            }
        }
        return true;
    }
}
