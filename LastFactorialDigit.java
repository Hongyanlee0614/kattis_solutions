package kattis;

import java.util.Scanner;

public class LastFactorialDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int multiply=1;
        for(int i=0;i<T;i++){
            int N=sc.nextInt();
            for (int a=N;a>0;a--){
                multiply=a*multiply;
                
            }
            
            System.out.println(multiply%10);
            multiply=1;
        }
    }
}
