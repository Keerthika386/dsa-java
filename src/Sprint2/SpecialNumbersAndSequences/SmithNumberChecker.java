package Sprint2.SpecialNumbersAndSequences;

import java.util.Scanner;

public class SmithNumberChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int copy = n;


        if(isPrime(n)){
            System.out.println("Not Smith Number");
            return;
        }
        int sum = 0;

        while( n > 0){
            sum += n % 10;
            n /=10;
        }

        int facorsum  = 0;
        while (copy % 2 ==  0){

            copy = copy /2;
            facorsum +=2;
//            System.out.println("fac" + facorsum);
        }

        for(int i=2;i*i <=copy;i++){

                while(copy > 0 && copy % i == 0){

                    copy = copy / i;
//                    System.out.println("fac" + i);
                    if(i <= 9){
                        facorsum +=i;
                    }else{

                        int num = i;
                        while( num > 0){
                            facorsum += num % 10;
                            num /=10;
                        }
                    }

                }

        }

        if(copy > 1) {
            if (copy <= 9) {
                facorsum += copy;
            } else {

                int num = copy;
                while (num > 0) {
                    facorsum += num % 10;
                    num /= 10;
                }
            }
        }

//        System.out.println("sum" + sum);
//        System.out.println("facorsum" + facorsum);


        System.out.println( sum == facorsum ? "Smith Number" :  "Not Smith Number");


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
