package kattis;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Chanukah {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int which=sc.nextInt();
            int input=sc.nextInt();
            System.out.print(which+" ");
            System.out.println(add(input)+input);
        }
    }
    public static int add(int n){
        if(n==0){
            return 0;
        }
        else{
            return n+add(n-1);
        }
    }
}
