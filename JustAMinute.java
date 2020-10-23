package kattis;

import java.util.Scanner;

public class JustAMinute {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        double countM=0,countS=0;
        for(int i=0;i<N;i++){
            int M=sc.nextInt();
            int S=sc.nextInt();
            countM+=M;
            countS+=S;
        }
        if(countS>(countM*60))
            System.out.println(countS/countM/60);
        else
            System.out.println("measurement error");
    }
}
