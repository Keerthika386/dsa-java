package Sprint2.BitManipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindHighestAndLowestSetBitPosition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int copy = n;

        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();


        if( n == 0){
            System.out.println(n);
            return;
        }
        while( n > 0){
            list.add(n % 2);
            n = n/2;
        }

        int highest = 0;
        for(int i=0;i<list.size();i++){
            if(list.get(i) == 1){
                highest = i;
            }
        }


        int res = copy & (-copy);

        while( res > 0){
            list1.add(res % 2);
            res = res/2;
        }

        int lowest = 0;
        for(int i=0;i<list1.size();i++){
            if(list1.get(i) == 1){
                lowest = i;
                break;
            }
        }

        System.out.println("Highest= " + highest);
        System.out.println("Lowest= " + lowest);


    }
}
