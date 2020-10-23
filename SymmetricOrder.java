package kattis;

import java.util.Scanner;

public class SymmetricOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=1;
        String s="";
        while(n!=0){
            n=sc.nextInt();
            if(n==0){
                break;
            }
            int[]charArr=new int[n];
            for(int i=0;i<n;i++){
                s=sc.nextLine();
                charArr[i]=s.length();
            }
            sc.next();
        }
    }
}
