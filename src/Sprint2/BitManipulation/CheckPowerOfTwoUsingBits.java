package Sprint2.BitManipulation;

import java.util.Scanner;

public class CheckPowerOfTwoUsingBits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n > 0 && (n&n-1) == 0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
}
