package kattis;

import java.util.Scanner;

public class TransitWoes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int t=sc.nextInt();
        int n=sc.nextInt();
        int countD=0,countB=0;
        int[]d=new int[n+1];
        int[]b=new int[n];
        int[]c=new int[n];
        for(int i=0;i<=n;i++){
            d[i]=sc.nextInt();
            countD+=d[i];
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();   
            countB+=b[i];
        }
        for(int i=0;i<n;i++){
            c[i]=sc.nextInt();
        }
        int dd=d[0],bb=b[0],cc=c[0];
        int ans=0;
        for(int i=0;i<n;i++){
            if(dd>cc/2){
                ans=ans+bb+cc;
                bb=b[i+1];
                cc=ans+c[i+1];
            }
        }
        int last=d[d.length-1];
    }
}
