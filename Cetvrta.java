package kattis;

import java.util.Arrays;
import java.util.Scanner;

public class Cetvrta {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]x=new int[3];
        int[]y=new int[3];
        for(int i=0;i<3;i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }
        Arrays.sort(x);
        Arrays.sort(y);
        if(x[1]==x[2]&&y[1]==y[2]){
            System.out.print(x[0]+" "+y[0]);
        }
        else if(x[1]==x[2]&&y[1]==y[0]){
            System.out.print(x[0]+" "+y[2]);
        }
        else if(x[1]==x[0]&&y[1]==y[2]){
            System.out.print(x[2]+" "+y[0]);
        }
        else if(x[1]==x[0]&&y[1]==y[0]){
            System.out.print(x[2]+" "+y[2]);
        }
    }
}
