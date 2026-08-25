package Sprint2.AdvancedPatternPrinting;

import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(1);
            }

            for(int space=1;space<=(2*n)-(2*i);space++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print(0);
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){

            for(int j=1;j<=i;j++){
                System.out.print(1);
            }

            for(int space=1;space<=(2*n)-(2*i);space++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print(0);
            }
            System.out.println();
        }


    }
}
