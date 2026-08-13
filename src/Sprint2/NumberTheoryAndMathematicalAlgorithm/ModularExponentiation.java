package Sprint2.NumberTheoryAndMathematicalAlgorithm;

import java.util.Scanner;

public class ModularExponentiation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int expo = sc.nextInt();
        int mod = sc.nextInt();
        double res = 0;


        System.out.println(modularExpo(base,expo,mod));
    }
    public static long modularExpo(int base,int expo,int mod){

        if( expo == 0){
            return 1;
        }
        long res = modularExpo(base,expo / 2,mod);
        if(expo % 2 == 0){
            return  (res * res) % mod;
        }else{
            return  (base * (res * res)) % mod;
        }
    }
}
