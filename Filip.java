package kattis;

import java.util.Scanner;

public class Filip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int aReverse=(A%10)*100+((A/10)%10)*10+(A/100);
        int bReverse=(B%10)*100+((B/10)%10)*10+(B/100);
        System.out.println(aReverse>=bReverse?aReverse:bReverse);
    }
}
