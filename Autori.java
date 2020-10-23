
package kattis;

import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String []split=s.split("-");
        for (int i=0;i<split.length;i++){
            System.out.print(split[i].charAt(0));
        }
    }
}
