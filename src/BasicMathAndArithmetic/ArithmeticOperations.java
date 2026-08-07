package BasicMathAndArithmetic;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        arithmeticOperation(A,B);
        swap(A,B);
        swapWithuoutTemp(A,B);
    }

    public static void arithmeticOperation(int A,int B) {

        int sum = A + B;
        int diff = A - B;
        int product = A * B;
        int quotient = A / B;

        System.out.print("Sum=" + sum + ", ");
        System.out.print("Diff=" + diff + ", ");
        System.out.print("Product=" + product + ", ");
        System.out.print("Quotient=" + quotient + ", ");

    }

    public  static void swap(int A,int B){
        int temp = A;
        A = B;
        B = temp;
        System.out.println("A=" + A + ", B=" + B);

    }

    public  static void swapWithuoutTemp(int A,int B){

        A = A + B;
        B = A - B;
        A = A - B;
        System.out.println("A=" + A + ", B=" + B);

    }
}
