package kattis;

import java.util.Scanner;

public class AnthonyAndDiablo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double radius=b/(2*Math.PI);
        double area=Math.PI*(Math.pow(radius,2));
        if (area>=a){
            System.out.println("Diablo is happy!");
        }
        else{
            System.out.println("Need more materials!");
        }
    }
}
