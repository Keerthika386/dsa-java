package Sprint3.Advanced2DPatternPrinting;

import java.util.Scanner;

public class AlphabetSpiralInMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                char ch = (char) ('A' + (count % 26));
                System.out.print(ch + " ");
                count++;
            }
            System.out.println();
        }


    }
}
