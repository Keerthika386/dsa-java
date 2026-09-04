package Sprint2.AdvancedPatternPrinting;

import java.util.Scanner;

public class SpiralMatrixClockwiseFill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;

        int count = 1;

        while(top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                matrix[left][i] = count;
                count++;
            }

            top++;

            for (int i = top; i <= bottom; i++) {
                matrix[i][bottom] = count;
                count++;
            }

            right--;
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = count;
                count++;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = count;
                count++;
            }
            left++;
        }


        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }


    }
}
