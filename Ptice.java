package kattis;

import java.util.Scanner;

public class Ptice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a="ABC";
        String a1=new String(new char[34]).replace("\0", a);
        String b="BABC";
        String b1=new String(new char[25]).replace("\0", b);
        String c="CCAABB";
        String c1=new String(new char[17]).replace("\0", c);
        int n=sc.nextInt();
        int countA=0,countB=0,countC=0;
        sc.nextLine();
        String ans=sc.nextLine();
        for(int i=0;i<ans.length();i++){
            if(ans.charAt(i)==a1.charAt(i)){
                countA++;
            }
            if(ans.charAt(i)==b1.charAt(i)){
                countB++;
            }
            if(ans.charAt(i)==c1.charAt(i)){
                countC++;
            }
        }
        if(countA>countB && countA>countC){
            System.out.println(countA);
            System.out.println("Adrian");
        }
        else if(countA==countB && countA==countC){
            System.out.println(countA);
            System.out.println("Adrian");
            System.out.println("Bruno");
            System.out.println("Goran");
        }
        else if(countA==countB && countA>countC){
            System.out.println(countA);
            System.out.println("Adrian");
            System.out.println("Bruno");
        }
        else if(countA==countC && countA>countB){
            System.out.println(countA);
            System.out.println("Adrian");
            System.out.println("Goran");
        }
        else if(countB==countC && countB>countA){
            System.out.println(countB);
            System.out.println("Bruno");
            System.out.println("Goran");
        }
        else if(countB>countA && countB>countC){
            System.out.println(countB);
            System.out.println("Bruno");
        }
        else if(countC>countA && countC>countB){
            System.out.println(countC);
            System.out.println("Goran");
        }
    }
}
