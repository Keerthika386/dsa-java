package Sprint1.LoopsAndPatterns;

import java.util.Scanner;

public class MultiplicationTablePrinter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.print( N +" * " + i + " = " + (N*i) + " ");
        }
    }
}
