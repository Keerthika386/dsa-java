package Sprint2.CombinatoricsMathSeries;

import java.util.Scanner;

public class CheckPerfectSquareAndPerfectCube {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int squareRoot = (int) Math.sqrt(n);
        int cubeRoot = (int) Math.cbrt(n);

       if(squareRoot * squareRoot == n){
           System.out.println("Perfect Square = " + squareRoot);
       }else{
           System.out.println("Not Perfect Square,");
       }

        if(cubeRoot * cubeRoot * cubeRoot == n){
            System.out.println("Perfect Cube = " + cubeRoot);
        }else{
            System.out.println("Not Perfect Cube,");
        }

    }
}
