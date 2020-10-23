package kattis;

import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int I=sc.nextInt();
        System.out.println((int)Math.ceil((I-0.99)*A));
    }
}
