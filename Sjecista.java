package kattis;

import java.util.Scanner;

public class Sjecista {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N==1||N==2||N==3){
            System.out.println("0");
        }
        else{
            System.out.println(N*(N-1)*(N-2)*(N-3)/24);
        }
    }
}
