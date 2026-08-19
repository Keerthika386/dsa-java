package Sprint2.GeometryAndAppliedMath;

import java.util.Scanner;

public class MatrixAdditionSubtractionAndScalarMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First matrix");

        int n = sc.nextInt();
        int m = sc.nextInt();


        int[][] matrix = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }


        System.out.println("Second matrix");

        int n1 = sc.nextInt();
        int m1 = sc.nextInt();


        int[][] matrix1 = new int[n1][m1];

        for(int i=0;i<n1;i++){
            for(int j=0;j<matrix1[i].length;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter k");
        int k = sc.nextInt();

        System.out.print("A+B = ");

        for (int i = 0; i < matrix.length; i++) {
            System.out.print('[');
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] +  matrix1[i][j]);
                System.out.print(',');
            }
            System.out.print(']');
            System.out.print(',');
        }


        System.out.print("A-B = ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print('[');
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] -  matrix1[i][j]);
                System.out.print(',');
            }
            System.out.print(']');
            System.out.print(',');
        }

        System.out.print(k +"* A = ");

        for (int i = 0; i < matrix.length; i++) {
            System.out.print('[');
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(k * matrix[i][j]);
                System.out.print(',');
            }
            System.out.print(']');
            System.out.print(',');
        }


    }
}
