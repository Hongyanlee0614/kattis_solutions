package kattis;

import java.util.Scanner;

public class SortOfSorting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        String[] s;
        while (n != 0) {
            n = sc.nextInt();
            sc.nextLine();
            s = new String[n];
            for (int i = 0; i < n; i++) {
                s[i] = sc.nextLine();
            }
            for (int i = 0; i < s.length - 1; i++) {
                for (int j = i+1; j < s.length - 1; j++) {
                    if ((s[i].compareTo(s[j]) < 0) && (s[j].charAt(0) != s[i].charAt(0)) && ((s[i].charAt(1) != s[j].charAt(1)))) {
                        String temp = s[j];
                        s[j] = s[i];
                        s[i] = temp;
                    }
                }
            }
            for (String t : s) {
                System.out.println(t);
            }
            System.out.println("");
        }
    }
}
