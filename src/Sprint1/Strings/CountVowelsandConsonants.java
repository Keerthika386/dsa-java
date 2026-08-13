package Sprint1.Strings;

import java.util.Scanner;

public class CountVowelsandConsonants {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int vowelsCount = 0;
        int consonantCount = 0;

        for(int i=0;i<s.length();i++){

            char current = s.charAt(i);

            if(current ==' '){
                continue;
            }
            if(current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u'){
                vowelsCount++;
            }else {
                consonantCount++;
            }
        }
        System.out.println("Vowels= " + vowelsCount + " Consonants= " +consonantCount);
    }
}
