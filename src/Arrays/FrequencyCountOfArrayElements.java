package Arrays;
import java.util.*;

public class FrequencyCountOfArrayElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.print(entry.getKey() + " - " + entry.getValue() + ", ");
        }

    }
}
