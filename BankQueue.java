package kattis;

import java.util.Scanner;

public class BankQueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numOfPeopleInQueue=sc.nextInt();
        int timeLeftOfOperation=sc.nextInt();
        int[]money=new int[numOfPeopleInQueue];
        int[]wantToLeave=new int[numOfPeopleInQueue];
        for (int i=0;i<numOfPeopleInQueue;i++){
            money[i]=sc.nextInt();
            wantToLeave[i]=sc.nextInt();
        }
        
    }
}
