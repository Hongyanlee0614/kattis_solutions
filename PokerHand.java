package kattis;

import java.util.Scanner;

public class PokerHand {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split(" ");
        int count = 1;
        for (int i = 0; i < split.length; i++) {
            for (int j = i+1; j < split.length; j++) {
                if (split[i].charAt(0) == split[j].charAt(0)) {
                    count++;
                }
            }
        }
        System.out.println(count/2+1);
    }

}
