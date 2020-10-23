package kattis;

import java.util.Scanner;

public class Bela {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        char B=sc.next().charAt(0);
        int sum=0;
        sc.nextLine();
        for (int i=0;i<4*N;i++){
            String a=sc.next();
            if (a.charAt(1)==B){
                if(a.charAt(0)=='T'){
                    sum+=10;
                }
                else if(a.charAt(0)=='9'){
                    sum+=14;
                }
                else if(a.charAt(0)=='J'){
                    sum+=20;
                }
                else if(a.charAt(0)=='Q'){
                    sum+=3;
                }
                else if(a.charAt(0)=='K'){
                    sum+=4;
                }
                else if(a.charAt(0)=='A'){
                    sum+=11;
                }
            }
            else{
                if(a.charAt(0)=='T'){
                    sum+=10;
                }
                else if(a.charAt(0)=='J'){
                    sum+=2;
                }
                else if(a.charAt(0)=='Q'){
                    sum+=3;
                }
                else if(a.charAt(0)=='K'){
                    sum+=4;
                }
                else if(a.charAt(0)=='A'){
                    sum+=11;
                }
            }
        }
        System.out.println(sum);
    }
}
