package Sprint3.AdvancedSpecialNumbers;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumbersUpToN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){

              if(isHappyNumber(i)){
                    System.out.print(i + " ");
            }
        }


    }

    public static boolean isHappyNumber(int num){

        int ans = 0;

        Set<Integer> set = new HashSet<>();
        while(num >0){

            ans = 0;
            while(num > 0) {
                int digit = num % 10;
                ans += (digit) * (digit);
                num = num / 10;
            }
            if(ans == 1) {
                return true;
            }

            if(set.contains(ans)){
                return false;
            }else{
                set.add(ans);
                num = ans;
            }
        }
        return false;
    }
}
