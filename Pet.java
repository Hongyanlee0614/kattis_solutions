package kattis;

import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int largest=0;
        int sum=0;
        int row=0;
        for (int i=0;i<5;i++){
            sum=0;
            for (int j=0;j<4;j++){
                int a=sc.nextInt();
                sum+=a;
                if(sum>largest){
                    largest=sum;
                    row=i+1;
                }
            }
        
        
        }
        System.out.println(row+" "+largest);
    }
}
