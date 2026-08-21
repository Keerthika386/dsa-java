package Sprint2.SpecialNumbersAndSequences;

import java.util.*;

public class GoldbachsConjectureVerification {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        Set<Integer> set = new HashSet<>();
//        for(int i=3;i<n;i++){
//
//            if(isPrime(i)){
//                set.add(i);
//            }
//        }
//
//        for(int num : set){
//
//            int findNum = n - num;
//            if(set.contains(findNum)){
//                System.out.println(num + "+" + findNum);
//                return;
//            }
//        }
//        System.out.println("No valid pairs");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for(int i=2;i<=n/2;i++){

            if(isPrime(i) && isPrime(n-i)){
                System.out.println(i + "+" + (n-i));
                return;
            }
        }
        System.out.println("No valid pairs");
    }

    public static boolean isPrime(int n){

        if(n <=1){
            return  false;
        }
        for(int i=2;i*i<=n;i++){

            if( n % i == 0){
                return false;
            }
        }
        return true;
    }
}
