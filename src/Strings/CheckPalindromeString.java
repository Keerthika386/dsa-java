package Strings;

import java.util.Scanner;

public class CheckPalindromeString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replace(" ", "");
        s = s.toLowerCase();
        int start = 0;
        int end = s.length()-1;

        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                System.out.println("False");
                return;
            }
            start++;
            end--;
        }
        System.out.println("True");

    }

}

