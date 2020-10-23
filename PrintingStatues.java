
package kattis;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PrintingStatues {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int printer=1;
        int day=1;
        while(printer<n){
            printer*=2;
            day+=1;
        }
        System.out.println(day);
    }
}
