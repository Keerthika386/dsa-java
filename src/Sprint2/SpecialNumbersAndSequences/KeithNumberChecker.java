package Sprint2.SpecialNumbersAndSequences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KeithNumberChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int copy = n;

        int sum = 0;
        List<Integer> list = new ArrayList<>();
        int count = 0;

        while(copy > 0){
            sum += copy % 10;
            list.add(copy % 10);
            copy /=10;
            count++;
        }
        Collections.reverse(list);

        int sumtot = 0;
        while( sum < n){
            int cnt = count;
            sumtot = 0;
            int size = list.size();

            while(cnt > 0){
                size--;
                 sumtot += list.get(size);
                 cnt--;
            }
            sum = sumtot;
            list.add(sumtot);

            if(sumtot == n){
                System.out.println(list);
                System.out.println("Keith Number");
                return;
            }

        }
        System.out.println("Not Keith Number");

    }
}
