package kattis;

import java.util.Scanner;

public class BookingARoom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        boolean [] b=new boolean[r];
        int booked=sc.nextInt();
        for(int i=0;i<booked;i++){
            int j=sc.nextInt();
            b[j-1]=true;
        }
        if(r==booked){
            System.out.println("too late");
        }
        for(int i=0;i<b.length;i++){
            if(b[i]==false){
                System.out.println(i+1);
                break;
            }
            
        }
    }
}
