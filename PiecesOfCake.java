package kattis;

import java.util.Scanner;

public class PiecesOfCake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int v=sc.nextInt();
        if (h<((n/2)+1) && v<(n/2)+1){
            System.out.println((n-h)*(n-v)*4);
        }
        else if(h<n/2 && v>=n/2){
            System.out.println((n-h)*v*4);
        }
        else if (h>=n/2 && v<n/2){
            System.out.println((n-v)*h*4);
        }
        else if (h>=n/2 && v>=n/2){
            System.out.println(h*v*4);
        }
    }
}
