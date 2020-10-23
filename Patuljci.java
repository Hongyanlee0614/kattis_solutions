package kattis;

import java.util.Scanner;

public class Patuljci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[9];
        int sum=0;
        for(int i=0;i<9;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        int wrong1=0,wrong2=0;
        for(int i = 0; i < 9; i++) {
            for(int j = i+1; j < 9; j++) {
                if(sum-arr[i]-arr[j]==100){
                    wrong1=arr[i];
                    wrong2=arr[j];
                }
            }
        }
        for(int i=0;i<9;i++){
            if(arr[i]!=wrong1 && arr[i]!=wrong2){
                System.out.println(arr[i]);
            }
        }
    }
}
