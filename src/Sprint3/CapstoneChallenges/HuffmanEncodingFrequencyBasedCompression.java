package Sprint3.CapstoneChallenges;

import java.util.*;

public class HuffmanEncodingFrequencyBasedCompression {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String  s = sc.next();

        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char current = s.charAt(i);
            map.put(current,map.getOrDefault(current,0)+1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a,b)->
            b.getValue() - a.getValue()
        );

        String res = "0";
        String curres = res;

        Map<Character,String> map1 = new HashMap<>();
        map1.put(list.get(0).getKey(),res);

        for(int i = 1; i < list.size(); i++){

             if(i == list.size()-1){
                 curres = "1";
                 int size = i-1;
                 while(size > 0){
                     curres = "1" + curres;
                     size--;
                 }
             }else{
                 curres = "1" + curres;
             }

            map1.put(list.get(i).getKey(),curres);

        }
        for(int i = 0; i < s.length(); i++){

            char current = s.charAt(i);
            System.out.print(map1.get(current));

        }

    }
}
