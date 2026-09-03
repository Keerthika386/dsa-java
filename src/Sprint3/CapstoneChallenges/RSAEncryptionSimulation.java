package Sprint3.CapstoneChallenges;

import java.util.Scanner;

public class RSAEncryptionSimulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int e = sc.nextInt();
        int msg = sc.nextInt();

        int n = p * q;
        int pq = (p-1) * (q-1);

        int[] x = new int[1];
        int[] y = new int[1];

        extendedGCD(e, pq, x, y);
        int d = x[0];

        // Make d positive
        d = (d % pq + pq) % pq;

        // Step 5: Encryption
        long encrypted = modPow(msg, e, n);

        // Step 6: Decryption
        long decrypted = modPow(encrypted, d, n);

        System.out.println("Encrypted=" + encrypted);
        System.out.println("Decrypted=" + decrypted);


    }

    static int extendedGCD(int a, int b, int[] x, int[] y) {

        if (b == 0) {
            x[0] = 1;
            y[0] = 0;
            return a;
        }

        int[] x1 = new int[1];
        int[] y1 = new int[1];

        int gcd = extendedGCD(b, a % b, x1, y1);

        x[0] = y1[0];
        y[0] = x1[0] - (a / b) * y1[0];

        return gcd;
    }

    static long modPow(long base, long exponent, long mod) {

        long result = 1;

        while (exponent > 0) {

            if (exponent % 2 == 1) {
                result = (result * base) % mod;
            }

            base = (base * base) % mod;
            exponent = exponent / 2;
        }

        return result;
    }

}
