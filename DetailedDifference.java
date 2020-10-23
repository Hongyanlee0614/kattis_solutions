package kattis;

import java.util.Scanner;

public class DetailedDifference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s1 = "";
        String s2 = "";
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            s1 = sc.next();
            sc.nextLine();
            s2 = sc.next();
            char[] s1arr = s1.toCharArray();
            char[] s2arr = s2.toCharArray();
            System.out.println(s1);
            System.out.println(s2);
            for (int k = 0; k < s1arr.length; k++) {
                if (s1arr[k] == s2arr[k]) {
                    System.out.print(".");
                } else {
                    System.out.print("*");
                }
            }
        }

    }

}
