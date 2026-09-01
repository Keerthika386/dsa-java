package Sprint3.SimulationAndDataStructuresFromScratch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockPriceBestTimeToBuyAndSell {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = n-1;
        int min = Integer.MAX_VALUE;
        int maxprofit = -1;

        while(start <= end){
            min = Math.min(arr[start],min);
            int profit = arr[start] - min;
            maxprofit = Math.max(maxprofit,profit);
            start++;
        }
        System.out.println(maxprofit);

    }
}
