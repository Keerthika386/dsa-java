package Sprint2.CombinatoricsMathSeries;

import java.util.Scanner;

public class nCrCombinations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();

        int sum = 1;
        for(int i=0;i<c;i++){
            sum *= n-i;
            sum /= i+1;
        }
        System.out.println(sum);

    }



}
