package Sprint2.CombinatoricsMathSeries;

import java.util.Scanner;

public class ChineseRemainderTheorem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int m1 = sc.nextInt();

        int r2 = sc.nextInt();
        int m2 = sc.nextInt();

        int r3 = sc.nextInt();
        int m3 = sc.nextInt();

        int i = r1;
        while(i % m1 != r1  ||  i % m2 != r2){

            i +=m1;
        }

        int tot = m1 * m2;
        while(i % m3 != r3){

            i+=tot;
        }
        System.out.println(i);
        return;


//        for(int i=1;i<=1000;i++){
//
//            if(i % m1 == r1 && i % m2 == r2){
//
//                int tot = m1 * m2;
//
//
//                System.out.println("i" + i);
//                while(i % m3 != r3){
//
//                    i+=tot;
//                }
//                System.out.println(i);
//                return;
//
//
//            }
//        }


    }
}
