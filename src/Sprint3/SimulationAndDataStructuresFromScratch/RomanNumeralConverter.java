package Sprint3.SimulationAndDataStructuresFromScratch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RomanNumeralConverter {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int[] values = {1000 ,900 ,500 ,400, 100 , 90 ,50, 40, 10 , 9 , 5, 4 ,1};
//
//        String[] symbols = {"M", "CM", "D", "CD", "C", "XC","L","XL","X","IX","V","IV", "I"};
//
//        while (n > 0){
//
//            for(int i=0;i<values.length;i++){
//                if(n >= values[i]){
//                    System.out.print(symbols[i]);
//                    n = n - values[i];
//                    break;
//                }
//            }
//        }

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] values = {1000 ,900 ,500 ,400, 100 , 90 ,50, 40, 10 , 9 , 5, 4 ,1};

        String[] symbols = {"M", "CM", "D", "CD", "C", "XC","L","XL","X","IX","V","IV", "I"};

        int sum = 0;
        for(int i=s.length()-1;i>=0;i--){

            String str = Character.toString(s.charAt(i));

            for(int j=symbols.length-1;j>=0;j--) {

                if (str.equals(symbols[j])) {

                    if (i < s.length()-1) {

                        int next = findSymbol(Character.toString(s.charAt(i + 1)), symbols);
                        if (values[j] < values[next]) {
                            sum = sum - values[j];
                        } else {
                            sum += values[j];

                        }

                }else{
                    sum += values[j];
                }

                    break;
                }
            }

        }

        System.out.println(sum);



    }

    public static int findSymbol(String s,String[] symbols){

        for(int i=0;i<symbols.length;i++){
            if (s.equals(symbols[i])) {
                return i;
            }
        }

        return -1;


    }

}
