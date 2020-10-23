package kattis;

import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int N=sc.nextInt();
        int total=N*X;
        for (int i=0;i<N;i++){
            int a=sc.nextInt();
            total-=a;
        }
        System.out.print(total+X);
    }
}
