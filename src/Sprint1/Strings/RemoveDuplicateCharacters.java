package Sprint1.Strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<Character> set = new HashSet<>();

        for(int i=0;i<s.length();i++){

            char current = s.charAt(i);
            if(!set.contains(current)){
                System.out.print(s.charAt(i));
            }
            set.add(current);
        }
    }
}
