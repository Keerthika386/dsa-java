package Sprint3.CapstoneChallenges;

import java.util.Scanner;

public class FindAllPythagoreanTripletsUpTN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        for(int i=0;i<=n;i++){
//
//            for(int j=i+1;j<=n;j++){
//
//                for(int k = j+1;k<=n;k++){
//
//                    if((i*i) + (j*j) == k*k){
//                        System.out.print("(" + i + "," + j + "," + k + ")");
//                    }
//                }
//            }
//        }


        for(int i=1;i<=n;i++){

            for(int j=1;(i*i)+(j*j) <=n;j++){

                if(i > j) {

                    int a = (i * i) - (j * j);
                    int b = 2 * (i * j);
                    int c = (i * i) + (j * j);

                    if(a > b){
                        int temp = a;
                        a = b;
                        b = temp;
                    }
                    System.out.print("(" + a + "," + b + "," + c + ")");

                }

            }
        }




    }
}
