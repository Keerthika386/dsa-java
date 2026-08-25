package Sprint3.Advanced2DPatternPrinting;

import java.util.Scanner;

public class CrossPatternInAMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int mid =  (int) Math.ceil(n/2.0);

        for(int i=1;i<=n;i++){

            for(int j=1;j<=n;j++){

                if(i== mid || j == mid){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
