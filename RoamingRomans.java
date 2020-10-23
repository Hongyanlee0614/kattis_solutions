package kattis;

import java.util.Scanner;

public class RoamingRomans {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        System.out.printf("%d",Math.round(d*5280000/4854));
    }

}
