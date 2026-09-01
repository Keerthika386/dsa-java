package Sprint3.AdvancedSpecialNumbers;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DecodetheMessageCipherFrequencyAnalysis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String  s = sc.nextLine();

        s = s.replace(" ","");

        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){

            char current = s.charAt(i);
            map.put(current, map.getOrDefault(current,0)+1);
        }
        System.out.println(map);

    }
}
