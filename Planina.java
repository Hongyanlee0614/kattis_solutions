package kattis;

import java.util.Scanner;

public class Planina {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N == 1) {
                System.out.println("9");
               
            }
        int a = 2;
        int b = 3;
        int c = 0;
        int j = 1;
        int k;
        for (int i = 0; i < N - 1; i++) {
            
            c = (int) Math.pow(2, j) + b;
            a = b;
            b = c;
            j++;
        }
        if (j != 1) {
            System.out.println(c * c);
        }
    }
}
