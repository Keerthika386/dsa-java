package Sprint2.AdvancedPatternPrinting;

import java.util.Scanner;

public class AlphabetPyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print((char) ('A' + j-1));
            }

            for(int k=i-1;k>=1;k--){
                System.out.print((char) ('A' + k-1));
            }
            System.out.println();
        }

    }
}
