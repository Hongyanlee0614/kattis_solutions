/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kattis;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MixedFractions {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //int a=1;int b=0;
        String line="";
        while(!line.equals("0 0")){
            line=sc.nextLine();
            if(line.equals("0 0")){
                break;
            }
            String[]split=line.split(" ");
            int numerator=Integer.parseInt(split[0]);
            int denominator=Integer.parseInt(split[1]);
            System.out.println((numerator/denominator)+" "+(numerator%denominator)+" / "+denominator);
        }
    }
}
