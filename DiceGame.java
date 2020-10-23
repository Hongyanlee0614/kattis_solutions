package kattis;

import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] p1 = new int[4];
        int[] p2 = new int[4];
        for (int i = 0; i < 4; i++) {
            p1[i]=sc.nextInt();
            
        }
        for (int i = 0; i < 4; i++) {
            p2[i]=sc.nextInt();
            
        }
        double dp1=((p1[0]+p1[1])/2.0 +(p1[2]+p1[3])/2.0);
        double dp2=((p2[0]+p2[1])/2.0 +(p2[2]+p2[3])/2.0);
       
        if(dp1>dp2){
            System.out.println("Gunnar");
        }
        else if(dp1==dp2){
            System.out.println("Tie");
        }
        else{
            System.out.println("Emma");
        }
    }
}
