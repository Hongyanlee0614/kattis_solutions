package kattis;

import java.util.Scanner;

public class ColdputerScience {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int count=0;
        for (int i=0;i<num;i++){
            int a=sc.nextInt();
            if (a<0){
                count++;
            }
        }
        System.out.println(count);
    }
}
