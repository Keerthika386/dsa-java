package Sprint2.CombinatoricsMathSeries;

import java.util.Scanner;

public class TriangularSquareandPentagonalNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("Triangular: ");

        long triangularSum = 0;
        int count = 0;

        int i = 1;
        while(count < n){
            triangularSum += i;
            System.out.print(triangularSum + " ");
            count++;
            i++;
        }

        System.out.println();

        long squareSum = 0;
        System.out.print("Square: ");

        i = 1;
        count = 0;
        while(count < n){

            squareSum += i;
            System.out.print(squareSum + " ");
            count++;
            i += 2;
        }
        System.out.println();

        long pentagonalSum = 0;
        System.out.print("Pentagonal: ");

        i = 1;
        count = 0;
        while(count < n){

            pentagonalSum += i;
            System.out.print(pentagonalSum + " ");
            count++;
            i += 3;
        }
        System.out.println();


    }
}
