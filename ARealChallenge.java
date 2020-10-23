package kattis;

import java.util.Scanner;

public class ARealChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = Math.sqrt(a);
        System.out.println(b*4);
    }

}
