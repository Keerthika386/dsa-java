package Sprint2.GeometryAndAppliedMath;

import java.util.Scanner;

public class ZellersCongruenceDayOfWeek {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        if(month == 1){
            month = 13;
            year = year-1;
        }else  if(month == 2){
            month = 14;
            year = year-1;
        }

        int k = year % 100;
        int j = year / 100;



        int res =   (day + (13*(month+1)/5) + k + (k/4) + (j/4) + (5*j))  % 7;

        if(res == 0){
            System.out.println("Saturday");
        } else if (res == 1) {
            System.out.println("Sunday");
        }else if (res == 2) {
            System.out.println("Monday");
        }else if (res == 3) {
            System.out.println("Tuesday");
        }else if (res == 4) {
            System.out.println("Wednesday");
        }else if (res == 5) {
            System.out.println("Thursday");
        }else if (res == 6) {
            System.out.println("Friday");
        }


    }
}
