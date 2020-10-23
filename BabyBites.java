package kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class BabyBites {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            String s = sc.next();
            if (!s.equals("mumble") && !(Integer.valueOf(s)==(i+1))) {
                System.out.println("something is fishy");
                break;
            }
            if (i == num - 1) {
                System.out.println("makes sense");
            }
        }

    }

}
