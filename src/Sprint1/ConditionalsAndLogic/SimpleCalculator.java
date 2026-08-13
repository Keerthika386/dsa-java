package Sprint1.ConditionalsAndLogic;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        char op = sc.next().charAt(0);
        int B = sc.nextInt();

        if(op == '+'){
            System.out.println(A+B);
        }else if(op == '-'){
            System.out.println(A-B);
        }else if(op == '*'){
            System.out.println(A*B);
        }else if(op == '/'){
            if(B == 0){
                System.out.println("Error: Division by zero");
                return;
            }
            System.out.println(A/B);
        }else if(op == '%'){
            System.out.println(A%B);
        }

    }
}
