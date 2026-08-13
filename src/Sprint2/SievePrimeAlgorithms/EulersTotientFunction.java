package Sprint2.SievePrimeAlgorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EulersTotientFunction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        list = primeFactor(n,list);
        double tot = n;

        for(int i=0;i<list.size();i++){
            tot*= 1-(1.0/list.get(i));
        }
        System.out.println((int)tot);
    }

    public static  List<Integer> primeFactor(int n , List<Integer> list){

        while( n % 2 == 0){
            n = n/2;

            if(!list.contains(2)){
                list.add(2);
            }
        }


        if( n >1 &&  n <= 3){
            if(!list.contains(n)){
                list.add(n);
            }
            return list;
        }

        for(int i = 3;i<n;i=i+2){

            if(n % i == 0){

                while(n % i == 0 &&  n > 1){
                    n = n/i;
                    if(!list.contains(i)){
                        list.add(i);
                    }
                }
            }
        }

        if(n > 1){
            if(!list.contains(n)){
                list.add(n);
            }

        }
        return list;
    }
}
