package Sprint3.Advanced2DPatternPrinting;

import java.util.Scanner;

public class AlphabetSpiralInMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] matrix = new char[n][n];

        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;

        int count = 0;

        while(top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                char ch = (char) ((count % 26) + 'A');
                matrix[left][i] =  ch;
                count++;
            }

            top++;

            for (int i = top; i <= bottom; i++) {
                char ch = (char) ((count % 26) + 'A');
                matrix[i][bottom] = ch;
                count++;
            }

            right--;
            for (int i = right; i >= left; i--) {
                char ch = (char) ((count % 26) + 'A');
                matrix[bottom][i] = ch;
                count++;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                char ch = (char) ((count % 26) + 'A');
                matrix[i][left] = ch;
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
