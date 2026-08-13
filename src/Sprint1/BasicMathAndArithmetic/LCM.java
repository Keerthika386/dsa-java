package Sprint1.BasicMathAndArithmetic;

import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int ans = (A*B)/GCD(A,B);
        System.out.println(ans);
    }
    public static int GCD(int A,int B) {

        while(A > 0 && B > 0){

            if( A > B){
                A = A % B;
            }else{
                B = B % A;
            }
        }
       return A == 0 ? B : A;
    }
}
