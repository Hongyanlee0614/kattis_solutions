package kattis;

import java.util.Scanner;

public class SevenWonders {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int sum=0;
        int countT=0;
        int countC=0;
        int countG=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='T'){
                countT++;
            }
            else if (s.charAt(i)=='C'){
                countC++;
            }
            else if(s.charAt(i)=='G'){
                countG++;
            }
        }
        int min=countT;
        if(countT>=countG && countG>=countC){
            min=countC;
        }
        else if(countG<=countC && countG<=countT){
            min=countG;
        }
        else if(countT<=countG && countT<=countC){
            min=countT;
        }
        if(countT!=0 &&countG!=0 && countC!=0){
            System.out.println(countT*countT+countC*countC+countG*countG+7*min);
        }
        else{
            System.out.println(countT*countT+countC*countC+countG*countG);
        }
    }
}
