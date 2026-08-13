package Sprint1.NumberTheoryFundamentals;

import java.util.Scanner;

public class PowerOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int expo = sc.nextInt();
        long power = 1;

//        for(int i=1;i<=expo;i++){
//
//            power *= base;
//        }
//        System.out.println(power);

        if (expo < 0) {
            base = 1 / base;
            expo = -expo;
        }

        System.out.println(powerNumber(base,expo));


    }
    public static long powerNumber(int base,int expo){

        if(expo == 0){
            return 1;
        }
        long half = powerNumber(base,expo/2);
        if(expo % 2 ==0){
            return half * half;
        }else{
            return  base * half * (half);
        }

    }
}
