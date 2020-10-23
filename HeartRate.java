package kattis;

import java.util.Scanner;

public class HeartRate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for (int i=0;i<N;i++){
            int b=sc.nextInt();
            double p=sc.nextDouble();
            double min=60*(b-1)/p;
            double normal=60*b/p;
            double max=60*(b+1)/p;
            System.out.printf("%.4f %.4f %.4f",min,normal,max);
            System.out.println("");
        }
    }
    
}
