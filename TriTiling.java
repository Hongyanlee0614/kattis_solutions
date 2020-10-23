package kattis;

import java.util.Scanner;

public class TriTiling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        while(i!=-1){
            i=sc.nextInt();
            if(i==0){
                System.out.println("0");
            }
            else if(i==1){
                System.out.println("1");
            }
            else if(i==2){
                System.out.println("3");
            }
        }
    }
}
