package kattis;

import java.util.Arrays;
import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int[]x=new int[n];
            for(int j=0;j<n;j++){
                x[j]=sc.nextInt();
            }
            Arrays.sort(x);
            System.out.println((x[x.length-1]-x[0])*2);
        }
    }
}
