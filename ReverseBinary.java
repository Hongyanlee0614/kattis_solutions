package kattis;

import java.util.Scanner;

public class ReverseBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while(N!=0){
            sb.append(N%2);
            N/=2;
        }
        double ans=0;
        int index=0;
        for(int j=sb.length()-1;j>=0;j--){
            ans=ans+Integer.parseInt(String.valueOf(sb.charAt(j)))*Math.pow(2, index++);
        }
        System.out.println((int)ans);
    }
}
