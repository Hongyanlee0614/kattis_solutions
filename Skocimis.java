package kattis;

import java.util.Scanner;

public class Skocimis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(c-b==1 && b-a==1){
            System.out.println("0");
        }
        else if(c-b==b-a){
            System.out.println(c-b-1);
        }
        else if(c-b>b-a){
            if(c-b==2){
                System.out.println("1");
            }
            else{
                System.out.println(c-b-1);
            }
        }
        else if(c-b<b-a){
            if(b-a==2){
                System.out.println("1");
            }
            else{
                System.out.println(b-a-1);
            }
        }
    }
}
