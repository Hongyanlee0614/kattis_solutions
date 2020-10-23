package kattis;

import java.util.Scanner;

public class SomeSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num==1){
            System.out.println("Either");
        }
        else if(num==2){
            System.out.println("Odd");
        }
        else if(num%2==1 &&num>2){
            System.out.println("Either");
        }
        else if(num%2==0 &&(num/2)%2==1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
}
