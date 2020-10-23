package kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class Recount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> al=new ArrayList<>();
        String a;
        do{
            a=sc.nextLine();
            al.add(a);
        }while(!a.equals("***"));
        for (int i=0;i<al.size();i++){
            for (int j=i+1;j<al.size();j++){
                if(al.get(i).equals(al.get(j))){
                    
                }
            }
        }
    }
}
