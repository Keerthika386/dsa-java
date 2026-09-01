package Sprint3.SimulationAndDataStructuresFromScratch;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Matrix");

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];



        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]  = sc.nextInt();
            }
        }


        System.out.println("Enter second Matrix");
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        int[][] matrix1 = new int[n1][m1];


        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                matrix1[i][j]  = sc.nextInt();
            }
        }

        int[][] res = new int[n][m1];
        for(int i=0;i<n;i++){

            for(int j=0;j<m1;j++){

                int sum = 0;
                for(int k=0;k<m;k++) {
                    sum += matrix[i][k] *  matrix1[k][j];
                    res[i][j] = sum ;

                }
            }

            System.out.println();
        }
        for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){
                System.out.print(res[i][j] + " ");
            }

            System.out.println();
        }

    }
}
