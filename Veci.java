package kattis;

import java.util.Scanner;

public class Veci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        String x=Integer.toString(X);
        if(x==null||x.length()==0){
            System.out.println("you must provide a string of length > 0");
        }
        String[]a=permute("",x);
    }
    public static String[] permute(String prefix, String remaining){
        String[]ans=new String[999999];
        if(remaining.length()==0){
            System.out.println(prefix);
        }
        for(int i=0;i<remaining.length();i++){
            ans=permute(prefix+remaining.charAt(i),remaining.substring(0,i)+remaining.substring(i+1,remaining.length()));
        }
        return ans;
    }
}
