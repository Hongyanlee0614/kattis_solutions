package kattis;

import java.util.Scanner;

public class SimonSays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] split = s.split(" ");
            if (split[0].equals("Simon") && split[1].equals("says")) {
                for (int j = 2; j < split.length; j++) {
                    System.out.print(" " + split[j]);
                }
            }
        }
    }
}
