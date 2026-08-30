package Sprint3.RecursionDeepDive;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        hanoi(n,'A','B','C');
    }
    public static void hanoi(int n,char A,char B,char C){

        if(n == 1){
            System.out.print(A);
            System.out.print('-');
            System.out.print(C);
            System.out.println();
            return;
        }


        hanoi(n-1,A,C,B);

        System.out.print(A);
        System.out.print('-');
        System.out.print(C);
        System.out.println();

        hanoi(n-1,B,A,C);

    }
}
