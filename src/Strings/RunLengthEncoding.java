package Strings;

import java.util.Scanner;

public class RunLengthEncoding {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 1;


        for (int i=1;i<s.length();i++){

            if(s.charAt(i) != s.charAt(i-1)){
                if(count > 1){
                    System.out.print(s.charAt(i-1));
                    System.out.print(count);
                }else if(count == 1){
                    System.out.print(s.charAt(i-1));
                }

                count = 0;
            }

            count++;
            if(i == s.length()-1){
                if(count > 1) {
                    System.out.print(s.charAt(i));
                    System.out.print(count);
                }else{
                    System.out.print(s.charAt(i));
                }
            }
        }
    }
}
