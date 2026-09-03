package Sprint3.CapstoneChallenges;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ValidateAndSolveSudoku {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }


        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){

            set = new HashSet<>();
            for(int j=0;j<m;j++){
                int current = matrix[i][j];
                if(current !=0 && set.contains(current)){
                    System.out.println("InValid");
                    return;
                }
                set.add(current);
            }

        }

        Set<Integer> set1 = new HashSet<>();
        for(int i=0;i<m;i++){

            set1 = new HashSet<>();
            for(int j=0;j<n;j++){
                int current = matrix[j][i];
                if(current !=0 && set1.contains(current)){
                    System.out.println("InValid");
                    return;
                }
                set1.add(current);
            }

        }

        Set<Integer>[] set2 = new HashSet[9];

        for(int i=0;i<9;i++){
            set2[i] = new HashSet<>();
        }
        for(int i=0;i<m;i++){

            for(int j=0;j<n;j++){
                int boxindex = ((i/3)*3) + (j/3);

                int current = matrix[j][i];
                if(current !=0 && set2[boxindex].contains(current)){
                    System.out.println("InValid");
                    return;
                }
                set2[boxindex].add(current);
            }

        }
        System.out.println("Valid");

    }
}
