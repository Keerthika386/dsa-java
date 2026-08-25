package Sprint3.Advanced2DPatternPrinting;

import java.util.Scanner;

public class StaircaseNumberPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){

                System.out.print(j);
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++){

            for(int space = 1;space <= n-i ;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){

                System.out.print(j);
            }
            System.out.println();
        }


    }
}
