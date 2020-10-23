package kattis;

import java.util.Scanner;

public class Ostgotska {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        String[]split=s.split(" ");
        for(int i=0;i<split.length;i++){
            for(int j=0;j<=split[i].length()-2;j++){
                if(split[i].substring(j, j+2).equals("ae")){
                    count++;
                    break;
                }
            }
        }
        if(count*100/split.length>=40){
            System.out.println("dae ae ju traeligt va");
        }
        else{
            System.out.println("haer talar vi rikssvenska");
        }
    }
}
