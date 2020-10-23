package kattis;

import java.util.Scanner;

public class YinYangStones {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int countW=0,countB=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='W'){
                countW++;
            }
            else{
                countB++;
            }
        }
        if(countB==countW){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
