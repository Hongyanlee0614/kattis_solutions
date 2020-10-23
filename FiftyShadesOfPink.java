package kattis;

import java.util.Scanner;

public class FiftyShadesOfPink {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int count = 0;
        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();

            for (int k = 0; k < s.length() - 3; k++) {
                if ((s.substring(k, k + 4).equalsIgnoreCase("pink")) || (s.substring(k, k + 4).equalsIgnoreCase("rose"))) {
                    count++;
                    break;
                }
            }

        }
        if (count == 0) {
            System.out.println("I must watch Star Wars with my daughter");
        } else {
            System.out.println(count);
        }
    }
}
