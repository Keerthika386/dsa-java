package Sprint3.RecursionDeepDive;

import java.util.Scanner;

public class CountPathsInGridUsingRecursion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] memo = new int[m][n];
        System.out.println(countPaths(m,n,memo));

    }
    public static int countPaths(int m,int n,int[][] memo){

        if(m == 1){
            return 1;
        }

        if(n == 1){
            return 1;
        }

        if(memo[m-1][n-1] != 0){
            return memo[m-1][n-1];
        }
        int count = countPaths(m-1,n,memo);
        int count1 = countPaths(m,n-1,memo);
        memo[m-1][n-1] = count + count1;

        return  count + count1 ;
    }
}
