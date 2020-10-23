package kattis;

import java.util.Scanner;

public class TheAmazingHumanCannonBall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            double v=sc.nextDouble();
            double theta=sc.nextDouble();
            double x=sc.nextDouble();
            double h1=sc.nextDouble();
            double h2=sc.nextDouble();
            double t=x/(v*(Math.cos(Math.toRadians(theta))));
            double y=v*t*Math.sin(Math.toRadians(theta))-(0.5*9.81*t*t);
            if(y>=h1+1 && y<=h2-1){
                System.out.println("Safe");
            }
            else{
                System.out.println("Not Safe");
            }
        }
    }
}
