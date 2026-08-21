package Sprint2.CombinatoricsMathSeries;

import java.util.*;

public class PascalsTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for(int i=1;i<=n;i++){
           pascalTriangle(i);
        }

    }
    public static void pascalTriangle(int row){

        int ans = 1;

        System.out.print(ans + " ");
        for(int i=1;i<row;i++){

            ans = ans *(row-i);
            ans /= i;
            System.out.print(ans + " ");

        }
        System.out.println();

    }
}
