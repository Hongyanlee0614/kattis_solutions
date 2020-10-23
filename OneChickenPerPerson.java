package kattis;

import java.util.Scanner;

public class OneChickenPerPerson {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        if(N>M){
            if(N-M==1){
                System.out.println("Dr. Chaz needs 1 more piece of chicken!");
            }
            else{
                System.out.println("Dr. Chaz needs "+(N-M)+" more pieces of chicken!");
            }
        }
        else if(N<M){
            if(M-N==1){
                System.out.println("Dr. Chaz will have 1 piece of chicken left over!");
            }
            else{
                System.out.println("Dr. Chaz will have "+(M-N)+" pieces of chicken left over!");
            }
        }
    }
}
