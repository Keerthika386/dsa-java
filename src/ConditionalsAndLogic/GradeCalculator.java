package ConditionalsAndLogic;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        if(s >=90 && s <=100){
            System.out.println("A");
        }else if(s >= 75 && s <=89){
            System.out.println("B");
        }else if(s >= 60 && s <=74){
            System.out.println("C");
        }else if(s >= 50 && s <=59){
            System.out.println("D");
        }else if(s < 50){
            System.out.println("F");
        }
    }
}
