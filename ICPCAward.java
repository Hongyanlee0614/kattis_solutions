package kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class ICPCAward {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String s="";
        String[]a=new String[N];
        String[]b=new String[N];
        sc.nextLine();
        for(int i=0;i<N;i++){
            s=sc.nextLine();
            String[]split=s.split(" ");
            a[i]=split[0];
            b[i]=split[1];
        }
        ArrayList<String>arr=new ArrayList<>();
        ArrayList<String>arr1=new ArrayList<>();
        int count=0;
        for(int j=0;j<N;j++){
            if(count==12){
                break;
            }
            if(!arr.contains(a[j])){
                arr.add(a[j]);
                arr1.add(b[j]);
                count++;
            }
        }
        for(int i=0;i<12;i++){
            System.out.print(arr.get(i)+" "+arr1.get(i));
            System.out.println("");
        }
    }
}
