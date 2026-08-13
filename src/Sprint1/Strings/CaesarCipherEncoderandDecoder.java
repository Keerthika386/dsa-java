package Sprint1.Strings;

import java.util.Scanner;

public class CaesarCipherEncoderandDecoder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();

        char[] res = s.toCharArray();


        for(int i=0;i<res.length;i++){
            char a = (char) (((res[i] - 'A' + k ) % 26)+'A');
            res[i] = a;
        }
        String result = new String(res);
        System.out.println("Encoded= " +  result);

        for(int i=0;i<res.length;i++){
            char a = (char) (((res[i] - 'A' + (26-k) ) % 26)+'A');
            res[i] = a;
        }
        result = new String(res);
        System.out.print("Decoded= " +  result);



    }
}
