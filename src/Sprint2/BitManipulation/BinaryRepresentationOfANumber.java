package Sprint2.BitManipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BinaryRepresentationOfANumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        if( n == 0){
            System.out.println(n);
            return;
        }
        while( n > 0){
            list.add(n % 2);
            n = n/2;
        }
        Collections.reverse(list);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }

        System.out.println();

        String s1 = "1101";
        int res = 0;

        for(int i=0;i<s1.length();i++){
            int current = Character.getNumericValue(s1.charAt(i));
            res = (int) res * 2 + current;
        }
        System.out.println("Binary to decimal: " + res);

    }
}
