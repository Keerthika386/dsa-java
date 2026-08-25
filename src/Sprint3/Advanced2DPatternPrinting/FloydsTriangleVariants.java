package Sprint3.Advanced2DPatternPrinting;

import java.util.Scanner;

public class FloydsTriangleVariants {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int variant = sc.nextInt();


        if(variant == 1) {
            int count = 1;
            for (int i = 1; i <= n; i++) {

                for (int j = 1; j <= i; j++) {

                    System.out.print(count + " ");
                    count++;
                }
                System.out.println();
            }
        } else if( variant == 2){
            int count = 2;
            for (int i = 1; i <= n; i++) {

                for (int j = 1; j <= i; j++) {

                    System.out.print(count + " ");
                    count +=2;
                }
                System.out.println();
            }

        }else{

            int num = 2;
            for (int i = 1; i <= n; i++) {

                for (int j = 1; j <= i; j++) {

                    while(!prime(num)){
                        num++;
                    }

                    System.out.print(num + " ");
                    num++;

                }
                System.out.println();
            }

        }

    }
    public static boolean prime(int n){


        for(int i=2;i*i<=n;i++){

            if( n % i == 0){
               return false;
            }
        }
        return true;
    }
}
