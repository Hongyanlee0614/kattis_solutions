package kattis;

import java.util.Scanner;
import java.util.StringTokenizer;

public class NumbersOnATree {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        StringTokenizer ST = new StringTokenizer(line, " ");

        int root = (int) (Math.pow(2, Integer.parseInt(ST.nextToken()) + 1) - 1);
        String path;

        if (ST.hasMoreTokens()) {
            path = ST.nextToken();
        } else {
            path = "";
        }

        int ans = root;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'R') {
                ans = R(root, ans);
            } else {
                ans = L(root, ans);
            }
        }

        print(ans);

        scan.close();
    }

    public static int R(int root, int n) {
        return (2 * n - root - 2);
    }

    public static int L(int root, int n) {
        return (2 * n - root - 1);
    }

    public static void print(Object obj) {
        System.out.print(obj.toString());
    }

    public static void print(int n) {
        System.out.print(n);
    }

    public static void print(double d) {
        System.out.print(d);
    }

    public static void print(long l) {
        System.out.print(l);
    }

    public static void print(char c) {
        System.out.print(c);
    }

    public static void println(Object obj) {
        System.out.println(obj.toString());
    }

    public static void println(int n) {
        System.out.println(n);
    }

    public static void println(double d) {
        System.out.println(d);
    }

    public static void println(long l) {
        System.out.println(l);
    }

    public static void println(char c) {
        System.out.println(c);
    }
}
