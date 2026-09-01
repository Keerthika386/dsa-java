package Sprint3.RecursionDeepDive;

import java.util.Scanner;

public class PascalsTriangleRecursion {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int ans = 1;
//        System.out.print(ans + " ");
//        for(int i=1;i<n;i++){
//            ans = ans * (n-i);
//            ans = ans/i;
//            System.out.print(ans + " ");
//        }
//        System.out.println();


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;

        System.out.print(1 + " ");
        for (int i = 1; i <= n; i++) {
            System.out.print(combination(n, i, ans) +" ");
        }

    }
    public static int combination(int n,int k,int ans){

        if( k == n || k == 0){
            //System.out.println(1);
            return 1;
        }

        ans = combination(n-1,k-1,ans) + combination(n-1,k,ans);
        return ans;
    }

}
