package Sprint2.CombinatoricsMathSeries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumberBaseStaircase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        for(int i=start;i<=end;i++){
            binary(i);
            System.out.print(" ");
            octal(i);
            System.out.print(" ");
            System.out.print(i + " ");
            hex(i);
            System.out.print(" ");
            System.out.println();
        }
//        System.out.print(binary(2));

    }
    public static void binary(int n){

        int res = 0;
        List<Integer> list = new ArrayList<>();
        while(n > 0){
           list.add(n % 2);
            n = n/2;
        }
        Collections.reverse(list);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }

    }

    public static void octal(int n){

        int res = 0;
        List<Integer> list = new ArrayList<>();
        while(n > 0){
            list.add(n % 8);
            n = n/8;
        }
        Collections.reverse(list);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }

    }

    public static void hex(int n){

        int res = 0;
        List<Integer> list = new ArrayList<>();
        while(n > 0){
            list.add(n % 16);
            n = n/16;
        }
        Collections.reverse(list);

        for(int i=0;i<list.size();i++){

            int current = list.get(i);
            if(list.get(i) >= 10){
                char ch = (char) ('A' + current - 10);
                System.out.print(ch);
            }else{
                System.out.print(current);
            }


        }

    }
}
