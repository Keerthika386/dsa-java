package Sprint3.AdvancedSpecialNumbers;

import java.util.Scanner;
import java.util.Stack;

public class CheckIfArrayCanRepresentABSTPreorder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];


        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);


        int lowerBound = Integer.MIN_VALUE;

        for(int i =1;i<n;i++){

            int num = arr[i];
            if (num < lowerBound) {
                System.out.println("InValid");
                return;
            }

            while (!st.isEmpty() && num > st.peek()) {
                lowerBound = st.pop();
            }
            st.push(arr[i]);

        }
        System.out.println("Valid");
    }
}
