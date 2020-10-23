package kattis;

import java.math.BigInteger;
import java.util.Scanner;

public class ADifferentProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            BigInteger b = sc.nextBigInteger();
            BigInteger c = sc.nextBigInteger();
            if (b.compareTo(c) > 0) {
                System.out.println(b.subtract(c));
            } else if (c.compareTo(b) > 0) {
                System.out.println(c.subtract(b));
            } else if (c.compareTo(b) == 0) {
                System.out.println(0);
            }
        }
        sc.close();
    }
}
