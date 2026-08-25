package Sprint2.AdvancedPatternPrinting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZigzagNumberPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 1;
        boolean left = true;

        for(int i=1;i<=n;i++) {

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            if(left) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(count  + " ");
                    count++;
                }
                left = false;
            }else{

                List<Integer> list = new ArrayList<>();
                for (int j = 1; j <=i; j++) {
                    list.add(count);
                    count++;
                }

                for(int k=list.size()-1;k>=0;k--){
                    System.out.print(list.get(k)  + " ");
                }
                left = true;
            }
            System.out.println();
        }



    }
}
