package kattis;

import java.util.Scanner;

public class AboveAverage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int C=sc.nextInt();
        double average=0;
        int sum=0;
        double count=0;
        for(int i=0;i<C;i++){
            int N=sc.nextInt();
            
            int a[]=new int[N];
            for(int j=0;j<N;j++){
                a[j]=sc.nextInt();
                sum+=a[j];
                
            }
            average=sum/N;
            for(int k=0;k<N;k++){
                if(a[k]>average){
                    count++;
                }
            }
            System.out.printf("%.3f",count*100/N);
            System.out.println("%");
            count=0;
            sum=0;
            average=0;
        }
    }
}
