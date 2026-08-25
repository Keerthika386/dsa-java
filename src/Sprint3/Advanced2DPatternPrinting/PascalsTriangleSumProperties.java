package Sprint3.Advanced2DPatternPrinting;

import java.util.Scanner;
import java.util.*;

public class PascalsTriangleSumProperties {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();



        List<Integer> res = new ArrayList<>();
        boolean rowSumCorrect = true;
        boolean powerSumCorrect = true;
        boolean hockeyStick = true;

        int cnt = 0;
        int hockeysum = 0;

        for(int i=1;i<=n;i++){

            int powersum = 0;
            int sum = 0;


           res = pascalTriangle(i);

           for(int j=0;j<res.size();j++){
                sum += res.get(j);
               powersum = powersum * 10 + res.get(j);
           }

            if(i > 1){
                if(!(powersum == (int) Math.pow(11,i-1))){
                    powerSumCorrect = false;
                }
            }
            if(!(sum == (int)Math.pow(2,i-1))){
                rowSumCorrect = false;
            }

            if(i > 2){
                hockeysum +=  res.get(cnt);
                cnt++;
            }

        }

            if(rowSumCorrect){
                System.out.println("Sum of rows verified");
            }

            if(powerSumCorrect){
                System.out.println("powers of 11 verified");
            }

             res = pascalTriangle(n+1);

            if(hockeysum == res.get(cnt)){
                System.out.println("Hockey stick confirmed");
            }


        }

    public static List<Integer> pascalTriangle(int row){

        int ans = 1;
        System.out.print(ans + " ");
        List<Integer> list = new ArrayList<>();
        list.add(ans);
        int sum = ans;
        for(int i=1;i<row;i++){
            ans *= (row-i);
            ans /= i;
            sum += ans;
            list.add(ans);
            System.out.print(ans + " ");
        }

        System.out.println();
        return list;
    }
}
