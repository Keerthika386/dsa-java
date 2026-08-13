package Sprint1.ConditionalsAndLogic;

import java.util.Scanner;

public class TriangleValidity {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if( A+B > C &&  A+C > B && B+C > A){

            if( A==B && B==C){
                System.out.println("Valid - Equilateral");
            }else if((A == B && A !=C) || (B == C && A != B) || (C == A && C!=B)){
                System.out.println("Valid - Isosceles");
            }else{
                System.out.println("Valid - Scalene");
            }
        }else{
            System.out.println("Not a valid triangle");
        }
    }
}
