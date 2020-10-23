package kattis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IsitHalloween  {
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if (s.equals("DEC 25")||s.equals("OCT 31")){
            System.out.println("yup");
        }
        else{
            System.out.println("nope");
        }
    }
}
