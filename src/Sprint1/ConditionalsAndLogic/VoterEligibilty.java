package Sprint1.ConditionalsAndLogic;

import java.util.Scanner;

public class VoterEligibilty {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        if( A >=18 && C==1 && D==0){
            System.out.print("Eligible");
        }else {

            if(A < 18){
                System.out.println("Not Eligible - Too young");
            } else if (C == 0) {
                System.out.println("Not Eligible - Not a citizen");
            }else if(D == 1){
                System.out.println("Not Eligible - Disqualified");
            }
        }

    }



}
