package Sprint2.CombinatoricsMathSeries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FactorialWithLargeNumberDigitSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        list.add(1);

        for(int i=2;i<=n;i++) {

            int carry = 0;

            for (int j = 0; j < list.size(); j++) {

                int digit = i * list.get(j) + carry;
                list.set(j, digit % 10);
                carry = digit / 10;
            }
            while (carry > 0){
                list.add(carry % 10);
                carry /= 10;
            }
        }
        Collections.reverse(list);
        System.out.print("Factorial=");

        int digitSum = 0;

        for(int i=0;i<list.size();i++){

            System.out.print(list.get(i));
            digitSum += list.get(i);
        }

        System.out.println(", Digit sum=" + digitSum);


    }
}
