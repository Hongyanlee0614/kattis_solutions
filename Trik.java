package kattis;

import java.util.Scanner;

public class Trik {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ball=1;
        String a=sc.next();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='A'&&ball==1){
                ball+=1;
            }
            else if(a.charAt(i)=='A'&&ball==2){
                ball-=1;
            }
            else if(a.charAt(i)=='B'&&ball==2){
                ball+=1;
            }
            else if(a.charAt(i)=='B'&&ball==3){
                ball-=1;
            }
            else if(a.charAt(i)=='C'&&ball==1){
                ball+=2;
            }
            else if(a.charAt(i)=='C'&&ball==3){
                ball-=2;
            }
        }
        System.out.println(ball);
    }
}
