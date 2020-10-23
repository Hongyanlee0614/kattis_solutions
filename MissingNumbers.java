package kattis;

import java.util.Scanner;

public class MissingNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean[]ada=new boolean[arr[n-1]+1];
        for(int i=0;i<arr.length;i++){
            ada[arr[i]]=true;
        }
        int count=0;
        for(int i=0;i<ada.length;i++){
            if(!ada[i] &&i!=0){
                System.out.println(i);
                count++;
            }
        }
        if(count==0){
            System.out.println("good job");
        }
    }
}
