package kattis;

import java.util.Scanner;

public class Soylent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            int bottle=sc.nextInt();
            if(bottle%400==0){
                System.out.println((bottle/400));
            }
            else{
                System.out.println((bottle/400)+1);
            }
        }
    }
}
