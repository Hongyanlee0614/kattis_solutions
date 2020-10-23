package kattis;

import java.util.Scanner;

public class Sok {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int I=sc.nextInt();
        int J=sc.nextInt();
        int K=sc.nextInt();
        if(A==B && B==C && J==K && I==J){
            System.out.println("0.000000 0.000000 0.000000");
        }
        else if(A==B && B==C){
            if(I>J && I>K){
                System.out.println("0.000000 "+(B-(B*J/I))+" "+(C-(C*K/I)));
            }
            else if(J>K){
                System.out.println((A-(A*I/J))+" 0.000000 "+(C-(C*K/J)));
            }
            else{
                System.out.println((A-(A*I/K))+" "+(B-(B*J/K))+" 0.000000");
            }
        }
        else if(J==K && K==I){
            if(A<B && B<C){
                System.out.println("0.000000 "+(B-A)+" "+(C-A));
            }
            else if(B<C){
                System.out.println((A-B)+" 0.000000 "+(C-B));
            }
            else{
                System.out.println((A-C)+" "+(B-C)+" 0.000000");
            }
        }
        else{
            int a=A*((I+J+K)-I)/(I+J+K);
            int b=B*((I+J+K)-J)/(I+J+K);
            int c=C*((I+J+K)-K)/(I+J+K);
        }
    }
}
