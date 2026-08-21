package Sprint2.SpecialNumbersAndSequences;

import java.util.Scanner;

public class PythagoreanTripletsinRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){

            for(int j=i+1;j<=n;j++){

                for(int k = j+1;k<=n;k++){

                    if((i*i) + (j*j) == (k*k)){
                        System.out.print("(" + i + "," + j + "," + k + ")");
                    }

                }
            }
        }
    }
}
