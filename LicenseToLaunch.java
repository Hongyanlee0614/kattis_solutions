package kattis;

import java.util.Scanner;

public class LicenseToLaunch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        int minIndex = 0;
        for (int j = 1; j < n - 1; j++) {
            if (num[j] < num[minIndex]) {
                minIndex = j;
            }
        }

        System.out.println(minIndex);
    }
}
