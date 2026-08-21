package Sprint2.CombinatoricsMathSeries;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long sumOfSquares = n*(n+1)*(2*n+1)/6;
        long sumOfCubes = n*(n+1)/2 * n*(n+1)/2;
        long sumOfAlternating = 0;

        for(int i=1;i<=n;i++){

            if( i % 2 == 0){
                sumOfAlternating -= i;
            }else{
                sumOfAlternating += i;
            }
        }


        System.out.println("Sum of squares" + sumOfSquares);
        System.out.println("Sum of cubes" + sumOfCubes);
        System.out.println("Sum of num" + sumOfAlternating);


    }
}
