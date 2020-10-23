package kattis;

import java.util.Scanner;

public class DeathKnightHero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        for(int i=0;i<num;i++){
            String s=sc.next();
            if(!s.contains("CD")){
                count++;
            }
        }
        System.out.println(count);
    }
}
