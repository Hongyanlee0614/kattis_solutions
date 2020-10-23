package kattis;

import java.util.Scanner;

public class SpeedLimit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int miles = 0;
        int temp = 0;
        int t = 0;
        while (n != -1) {
            n = sc.nextInt();
            if (n==-1){
                break;
            }
            for (int i = 0; i < n; i++) {
                int s = sc.nextInt();
                temp = t;
                t = sc.nextInt();
                miles = miles + s * (t - temp);
                
            }
            temp=0;
            t=0;
            System.out.println(miles+" miles");
            miles=0;
        }
    }
}
