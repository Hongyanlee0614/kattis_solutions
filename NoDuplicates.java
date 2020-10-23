package kattis;

import java.util.Scanner;

public class NoDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String []split=s.split(" ");
        for(int i=0;i<split.length;i++){
            for(int j=i+1;j<split.length;j++){
                if(split[i].equalsIgnoreCase(split[j])){
                    System.out.println("no");
                    System.exit(0);
                }
                
            }
        }
        System.out.println("yes");
    }

}
