package kattis;

import java.util.Scanner;

public class JobExpenses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int sum=0;
        for(int j=0;j<num.length;j++){
            if(num[j]<0){
                sum+=Math.abs(num[j]);
            }
        }
        System.out.println(sum);
    }
}
