package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String w = sc.nextLine();

        s = s.toLowerCase();
        w = w.toLowerCase();

        String[] words = s.split(" ");
        Map<String,Integer> map = new HashMap<>();

        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }

        System.out.println(map.containsKey(w) ? map.get(w) : 0);
    }
}
