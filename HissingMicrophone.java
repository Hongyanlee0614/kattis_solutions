package kattis;

import java.util.Scanner;

public class HissingMicrophone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean isHiss=false;
        String s=sc.nextLine();
        for (int i=0;i<s.length();i++){
            if (i<=s.length()-2 && s.charAt(i)=='s' && s.charAt(i+1)=='s'){
                System.out.println("hiss");
                isHiss=true;
                break;
            }
            
        }
        if (!isHiss){
            System.out.println("no hiss");
        }
    }
}
