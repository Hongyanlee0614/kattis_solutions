package kattis;

import java.util.Scanner;

public class Basketball1v1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int countA = 0, countB = 0;
        char[] c = new char[s.length() / 2];
        char[] num = new char[s.length() / 2];
        for (int i = 0; i < s.length(); i += 2) {
            c[i] = s.charAt(i);
            num[i] = s.charAt(i + 1);
        }
        for (int i = 0; i < c.length; i++) {
            while ((countA < 12 && countB < 12) || countA - countB < 2 || countB - countA < 2) {
                if (c[i] == 'A') {
                    countA = countA + Integer.parseInt(String.valueOf(num[i]));
                } else {
                    countB = countB + Integer.parseInt(String.valueOf(num[i]));
                }
            }
        }
    }
}
