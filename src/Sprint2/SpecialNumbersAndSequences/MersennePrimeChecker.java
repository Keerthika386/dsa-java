package Sprint2.SpecialNumbersAndSequences;

import java.util.Scanner;

public class MersennePrimeChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(!isPrime(n)){
            System.out.println("Not Mersenne Prime");
            return;
        }
        for(int i=2;i<n;i++){

            if(isPrime(i)){
                if(Math.pow(2,i)-1 == n){
                    System.out.println("Mersenne Prime");
                    return;
                }
            }
        }
        System.out.println("Not Mersenne Prime");
    }
    public  static boolean isPrime(int n){

        if(n <=1){
            return false;
        }

        for(int i=2;i*i<=n;i++){

            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
