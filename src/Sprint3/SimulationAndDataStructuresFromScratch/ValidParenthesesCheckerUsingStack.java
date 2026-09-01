package Sprint3.SimulationAndDataStructuresFromScratch;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesesCheckerUsingStack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char current = s.charAt(i);

            if(current == '(' || current == '[' || current == '{' ){
                st.push(current);
                //System.out.println(st);
            }else {

                if(st.isEmpty()){
                    System.out.println("Not Balanced");
                    return;
                }

                char peek = st.peek();
                if((peek == '(' && current == ')') || (peek == '[' && current == ']') || (peek == '{' && current == '}')){
                    st.pop();
                }else {
                    System.out.println("Not Balanced");
                    return;
                }
            }
        }
        System.out.println(st.size() == 0 ? "Balanced" : "Not Balanced");

    }
}
