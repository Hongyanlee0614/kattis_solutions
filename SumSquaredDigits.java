package kattis;

import java.util.Scanner;

public class SumSquaredDigits {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int p=sc.nextInt();
       int ssd=0;
       for(int i=0;i<p;i++){
           int K=sc.nextInt();
           int b=sc.nextInt();
           int n=sc.nextInt();
           while(n>0){
               ssd+=Math.pow((n%b),2);
               n/=b;
           }
           System.out.println((i+1)+" "+ssd);
           ssd=0;
       }
    }
}
