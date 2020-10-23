package kattis;

import java.util.LinkedList;
import java.util.Scanner;

public class BlackFriday {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Integer> l=new LinkedList<>();
        for(int i=0;i<n;i++){
            int roll=sc.nextInt();
            l.add(roll);
        }
        if(l.get(0)==l.get(l.size())){
            System.out.println("none");
        }
        else if()
    }
}
