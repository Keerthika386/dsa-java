package Sprint1.ConditionalsAndLogic;

import java.util.Scanner;

public class TemperatureScaleConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        char scale = sc.next().charAt(0);


        if(scale == 'C'){
            double F = (T * 9.0/5)+32;
            double K = T+273.15;
            System.out.println("F=" +  F +", K=" + K);
        }else if(scale == 'F'){
            double C = (T-32)/1.8;
            double K = C+273.15;
            System.out.println("C=" +  C +", K=" + K);
        }else if(scale == 'K'){
            double C = T-273.15;
            double F= (C * 9.0/5)+32;
            System.out.println("C=" +  C +", F=" + F);
        }
    }
}
