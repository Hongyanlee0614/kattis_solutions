package kattis;

import java.util.Scanner;

public class JudgingMoose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        if(l==0 &&r==0){
            System.out.println("Not a moose");
        }
        else if(l!=r){
            if(l>r){
                System.out.println("Odd "+(l*2));
            }
            else{
                System.out.println("Odd "+(r*2));
            }
        }
        else{
            System.out.println("Even "+(l*2));
        }
    }
}
