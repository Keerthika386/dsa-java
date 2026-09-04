package Sprint3.Advanced2DPatternPrinting;

import java.util.*;

public class DiagonalTraversalOfMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];

        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]  = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                if(!map.containsKey(i+j)){
                    map.put(i+j, new ArrayList<>());
                    map.get(i+j).add(matrix[i][j]);

                }else{
                    map.get(i+j).add(matrix[i][j]);
                }

            }
            System.out.println();
        }

        for(int i=0;i<n+m-1;i++){

            if(map.containsKey(i)){

                List<Integer> arr = map.get(i);
                int size = arr.size();

                if(i % 2 == 0){
                    for(int j=arr.size()-1;j>=0;j--){
                        System.out.print(arr.get(j) + " ");
                    }
                }else{
                    for(int j=0;j<arr.size();j++){
                        System.out.print(arr.get(j) + " ");
                    }

                }
            }
        }

    }
}
