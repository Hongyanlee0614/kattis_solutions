package kattis;

import java.util.Scanner;

public class TheEasiestProblemIsThisOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=1;
        while(N!=0){
            N=sc.nextInt();
            if(N==0){
                break;
            }
            int sum=sumDigit(N);
            for(int i=11;i<Integer.MAX_VALUE;i++){
                if(sumDigit(N*i)==sum){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
    public static int sumDigit(int num){
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}
