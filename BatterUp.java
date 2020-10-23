package kattis;

import java.util.Scanner;

public class BatterUp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int amount=0;
        int sum=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(a!=-1){
                amount++;
                sum+=a;
            }
        }
        System.out.println((double)sum/amount);
    }
}
