package kattis;

import java.util.Scanner;

public class PizzaCrust {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        double c=sc.nextDouble();
        System.out.println(((r-c)*(r-c)*100)/(r*r));
    }
}
