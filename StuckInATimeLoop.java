package kattis;

import java.util.Scanner;

public class StuckInATimeLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for (int i=0;i<N;i++){
            System.out.print(i+1+" Abracadabra\n");
        }
    }
}
