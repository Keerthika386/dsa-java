package Sprint1.LoopsAndPatterns;

import java.util.Scanner;

public class HollowRectanglePattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        for(int i=1;i<=M;i++){

            for(int j=1;j<=N;j++){
                if((i == 1 || i == M) || (j==1 || j == N)) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
