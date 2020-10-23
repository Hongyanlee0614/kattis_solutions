package kattis;

import java.util.Scanner;

public class OOP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int Q=sc.nextInt();
        String []a=new String[N];
        String []b=new String[Q];
        for(int i=0;i<N;i++){
            a[i]=sc.nextLine();
            sc.next();
        }
        for(int i=0;i<Q;i++){
            b[i]=sc.nextLine();
            sc.next();
        }
        int count=0;
        for(int j=0;j<Q;j++){
            for(int k=0;k<N;k++){
                if(a[k].substring(0,a[k].length()).contains(b[j])){
                    count++;
                }
            }
            System.out.println(count);
            count=0;
        }
    }
}
