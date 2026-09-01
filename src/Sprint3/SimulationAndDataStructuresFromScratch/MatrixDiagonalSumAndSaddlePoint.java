package Sprint3.SimulationAndDataStructuresFromScratch;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MatrixDiagonalSumAndSaddlePoint {
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
        int d1sum = 0;
        int d2sum = 0;
        int oddnum = 0;

        int j = 0;
        int mincol = 0;
        for(int i=0;i<n;i++){

            int min = Integer.MAX_VALUE;
            d1sum += matrix[i][i];
            d2sum += matrix[i][m-1-i];
            if( n % 2 !=0 && (matrix[i][i] == matrix[i][m-1-i])){
                oddnum = matrix[i][i];
            }
            for(j=0;j<m;j++){

                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    mincol = j;
                }

            }

            int maxnum = maxColumn(mincol,matrix);
            if(min == maxnum){
                System.out.println("sadd" + maxnum);
            }

            System.out.println();
        }

        System.out.println("Diagonal sum= " + ((d1sum + d2sum) - oddnum));



    }
    public static int maxColumn(int num,int[][] matrix){

        int max = Integer.MIN_VALUE;;
        for(int i=0;i<matrix.length;i++){
            max = Math.max(max,matrix[i][num]);
        }
        return max;
    }
}
