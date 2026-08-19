package Sprint2.GeometryAndAppliedMath;

import java.util.Scanner;

public class MagicSquareValidatorAndGenerator {
    public static void main(String[] args) {


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//
//        int[][] matrix = new int[n][m];
//
//        int magiconst =  n *(n*n+1)/2;
//
//        for(int i=0;i<n;i++){
//            for(int j=0;j<matrix[i].length;j++){
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//
//
//        for(int i=0;i<n;i++){
//            int row = 0;
//            int col = 0;
//            for(int j=0;j<matrix[i].length;j++){
//                row += matrix[i][j];
//                col += matrix[j][i];
//            }
//            if(row != magiconst || col !=magiconst){
//                System.out.println("Not a Magic Square");
//                return;
//            }
//        }
//        int diagonal1 = matrix[0][0] + matrix[1][1] + matrix[2][2];
//        int diagonal2 = matrix[0][2] + matrix[1][1] + matrix[2][0];
//
//
//        if(diagonal1 != magiconst || diagonal2 !=magiconst){
//            System.out.println("Not a Magic Square");
//            return;
//        }
//        System.out.println("Valid Magic Square," +  "constant=" +  magiconst);


        int[][] matrix = new int[3][3];
       
        int num = 1;
        int row = 0;
        int col = 1;
        matrix[row][col] = num;

        while(num < 9){


            int nextRow = row -1;
            int nextCol = col + 1;

            if(nextRow < 0){
                nextRow = 2;
            }

            if(nextCol > 2){
                nextCol = 0;
            }
            if( matrix[nextRow][nextCol] != 0){

                row = row + 1;
                if(row > 2){
                    row = 0;
                }

            }else {
                row = nextRow;
                col = nextCol;

            }
            num++;
            matrix[row][col] = num;
        }


        // Print
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }



    }
}
