package kattis;

import java.util.Scanner;

public class NumbersFun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[]ans=new String[n];
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(c==a+b){
                ans[i]="Possible";
            }
            else if(c==a*b){
                ans[i]="Possible";
            }
            else if(c==a-b){
                ans[i]="Possible";
            }
            else if(c==a/b && c*b==a){
                ans[i]="Possible";
            }
            else if(c==b-a){
                ans[i]="Possible";
            }
            else if(c==b/a && c*a==b){
                ans[i]="Possible";
            }
            else{
                ans[i]="Impossible";
            }
        }
        for(String s:ans){
            System.out.println(s);
        }
    }
}
