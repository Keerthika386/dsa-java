package Sprint1.Strings;

import java.util.Scanner;

public class ReverseaString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        //method 1
//        char[] str = s.toCharArray();
//        int start = 0;
//        int end = str.length-1;
//
//        while(start < end){
//            char temp = str[start];
//            str[start] = str[end];
//            str[end] = temp;
//            start++;
//            end--;
//        }
//
//        String res  = new String(str);
//        System.out.println(res);

        //method 2


        String result = new StringBuilder(s).reverse().toString();
        System.out.println(result);
    }
}
