package kattis;

import java.util.Scanner;

public class QALY {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        double sum=0;
        for (int i=0;i<N;i++){
            double q=sc.nextDouble();
            double y=sc.nextDouble();
            sum+=q*y;
        }
        System.out.println(sum);
    }
}
