package Sprint3.SimulationAndDataStructuresFromScratch;

import java.util.*;

public class WordFrequencyMap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        Map<String,Integer> map = new HashMap<>();

        List<Map.Entry<String, Integer>> list = new ArrayList<>();

        for(int i=0;i<s1.length;i++){
            map.put(s1[i], map.getOrDefault(s1[i],0)+1);
        }

        for(Map.Entry<String,Integer> map1 : map.entrySet() ){
            list.add(map1);
        }
        list.sort((a,b)->{
            if(!(a.getValue().equals(b.getValue()))){
                return b.getValue()-a.getValue();
            }
            return a.getKey().compareTo(b.getKey());
        });
        System.out.println(list);
    }
}
