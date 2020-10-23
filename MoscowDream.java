package kattis;

import java.util.Scanner;

public class MoscowDream {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int n=sc.nextInt();
        if(a==0||b==0||c==0||n<3||(a+b+c)<n){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}
