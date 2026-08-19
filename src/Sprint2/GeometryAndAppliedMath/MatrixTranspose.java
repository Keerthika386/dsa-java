package Sprint2.GeometryAndAppliedMath;

import java.util.Scanner;

public class MatrixTranspose {
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


        if( m == n){
//            for (int i = 0; i < matrix.length; i++) {
//                System.out.print('[');
//                for (int j = 0; j < matrix[i].length; j++) {
//                   // matrix[i][j] = matrix[j][i];
//                    System.out.print(matrix[j][i]);
//                    System.out.print(',');
//                }
//                System.out.print(']');
//                System.out.print(',');
//            }
            for (int i = 0; i < matrix.length; i++) {

                for (int j = 0; j < matrix[i].length; j++) {

                    if(i <j) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[j][i];
                        matrix[j][i] = temp;
                    }

                }

            }

            for (int i = 0; i < matrix.length; i++) {
                System.out.print('[');
                for (int j = 0; j < matrix[i].length; j++) {
                    // matrix[i][j] = matrix[j][i];

                    System.out.print(matrix[i][j]);
                    System.out.print(',');
                }
                System.out.print(']');
                System.out.print(',');
            }
        }else {
            int[][] matrixres = new int[m][n];
            for (int i = 0; i < matrixres.length; i++) {
                System.out.print('[');
                for (int j = 0; j < matrixres[i].length; j++) {
                    matrixres[i][j] = (matrix[j][i]);
                    System.out.print(matrixres[i][j]);
                    System.out.print(',');
                }
                System.out.print(']');
                System.out.print(',');
            }
        }



    }
}
