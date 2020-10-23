/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kattis;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class QuickEstimates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] count=new int[n];
        for(int i=0;i<n;i++){
            BigInteger num=sc.nextBigInteger();
            
            do{
                num=num.divide(new BigInteger("10"));
                count[i]++;
            }while (num!=BigInteger.ZERO);
        }
        for(int i:count){
            System.out.println(i);
        }
    }
}
