package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckAnagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
//        Map<Character,Integer> map = new HashMap<>();
//        Map<Character,Integer> map1 = new HashMap<>();
//
//
//        if(s1.length() != s2.length()){
//            System.out.println("Not Anagram");
//            return;
//        }
//        for(int i=0;i<s1.length();i++){
//            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
//            map1.put(s2.charAt(i),map1.getOrDefault(s2.charAt(i),0)+1);
//
//        }
//
//        for(int i=0;i<s1.length();i++){
//            char current = s1.charAt(i);
//            if(map.get(current) != map1.get(current)){
//                System.out.println("Not Anagram");
//                return;
//            }
//
//        }
//        System.out.println("Anagram");

        if(s1.length() != s2.length()){
            System.out.println("Not Anagram");
            return;
        }

        char[] chararray = s1.toCharArray();
        char[] chararray2 = s2.toCharArray();

        Arrays.sort(chararray);
        Arrays.sort(chararray2);

        for(int i=0;i<chararray.length;i++){

            if(chararray[i] != chararray2[i]){
                System.out.println("Not Anagram");
                return;
            }
        }

        System.out.println("Anagram");

    }
}
