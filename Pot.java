package kattis;

import java.util.Scanner;

public class Pot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int sum=0;
        for (int i=0;i<N;i++){
            int a=sc.nextInt();
            int num=a/10;
            int lastDigit=a%10;
            sum+=Math.pow(num,lastDigit);
        }
        System.out.println(sum);
    }
}
