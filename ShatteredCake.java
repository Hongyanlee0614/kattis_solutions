package kattis;

import java.util.Scanner;

public class ShatteredCake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int n=sc.nextInt();
        int sum1=0;
        for(int i=0;i<n;i++){
            int w1=sc.nextInt();
            int l1=sc.nextInt();
            sum1=sum1+w1*l1;
        }
        System.out.println(sum1/w);
    }
}
