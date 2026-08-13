package Sprint1.BasicMathAndArithmetic;

import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        while(A > 0 && B > 0){

            if( A > B){
                A = A % B;
            }else{
                B = B % A;
            }
        }
        System.out.println(A == 0 ? B : A);
    }
}
