package Sprint3.SimulationAndDataStructuresFromScratch;

import java.util.Scanner;

public class GameOfLifeOneGeneration {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]  = sc.nextInt();
            }
        }
        int[][] res = new int[n][m];

        for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){

                int neighbours = 0;

                if(j > 0){
                    neighbours +=  matrix[i][j-1];
                }
                if(j < m-1){
                    neighbours += matrix[i][j+1];
                }
                if( i > 0){
                    neighbours += matrix[i-1][j];
                }
                if( i < n-1){
                    neighbours += matrix[i+1][j];
                }
                if(i > 0 && j > 0){
                    neighbours += matrix[i-1][j-1];
                }
                if(i < n-1 && j < m-1){
                    neighbours +=  matrix[i+1][j+1];
                }
                if(i >0 && j < m-1){
                    neighbours +=  matrix[i-1][j+1];
                }
                if(i < n-1 && j > 0){
                    neighbours +=   matrix[i+1][j-1];
                }

                if(matrix[i][j] == 1){

                    if(neighbours < 2 || neighbours > 3){
                        res[i][j] = 0;
                    }else{
                        res[i][j] = 1;
                    }
                }else if (matrix[i][j] == 0){

                    if(neighbours == 3){
                        res[i][j] = 1;
                    }

                }

            }

        }

        for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();

        }


    }
}
