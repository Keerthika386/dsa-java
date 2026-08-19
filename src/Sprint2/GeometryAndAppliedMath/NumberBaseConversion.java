package Sprint2.GeometryAndAppliedMath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumberBaseConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int base = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        while( n > 0){
            list.add(n % base);
            n = n / base;
        }

        Collections.reverse(list);


        for (int i=0;i<list.size();i++){
            if(base == 16){
                if(list.get(i) <=9){
                    System.out.print(list.get(i));
                }else{
                    System.out.print((char)( 'A' + (list.get(i) - 10)));
                }
            }else {
                System.out.print(list.get(i));
            }
        }

        int res = 0;
        for (int i=0;i<list.size();i++){
            res = res * base + list.get(i);
        }

        System.out.println(" Back to decimal " + res);
    }
}
