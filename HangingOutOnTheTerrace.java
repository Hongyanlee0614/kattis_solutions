package kattis;

import java.util.Scanner;

public class HangingOutOnTheTerrace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int x = sc.nextInt();
        int count = 0;
        String[] enter = new String[x];
        String[] num = new String[x];
        sc.nextLine();
        for (int i = 0; i < x; i++) {
            String s = sc.nextLine();
            String[] split = s.split(" ");
            enter[i] = split[0];
            num[i] = split[1];
        }

        int en = 0;
        for (int i = 0; i < x; i++) {
            if (enter[i].equals("enter")) {
                en += Integer.parseInt(num[i]);
                if (en > L) {
                    count++;
                    en-=Integer.parseInt(num[i]);
                }
            } else if (enter[i].equals("leave")) {
                en -= Integer.parseInt(num[i]);
            }
        }
        System.out.println(count);
    }
}
