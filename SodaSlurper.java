package kattis;

import java.util.Scanner;

public class SodaSlurper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int own = sc.nextInt();
        int found = sc.nextInt();
        int required = sc.nextInt();
        System.out.print(total(own + found, required));
    }

    public static int total(int t, int required) {
        if (t < required) {
            return 0;
        } else if (t == required) {
            return 1;
        }
        return t / required + total(((t / required) + (t % required)), required);

    }
}
