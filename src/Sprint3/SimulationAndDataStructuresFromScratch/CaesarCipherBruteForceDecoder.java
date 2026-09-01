package Sprint3.SimulationAndDataStructuresFromScratch;

import java.util.Scanner;

public class CaesarCipherBruteForceDecoder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();



        int k = 1;
        while(k <=26) {
            char[] res = s.toCharArray();
            for (int i = 0; i < res.length; i++) {
                char a = (char) (((res[i] - 'A' + (26-k)) % 26) + 'A');
                res[i] = a;
            }
            System.out.println(res);
            k++;
        }

    }
}
