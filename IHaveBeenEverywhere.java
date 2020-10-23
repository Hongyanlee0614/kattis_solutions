package kattis;

import java.util.Scanner;

public class IHaveBeenEverywhere {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int test;
        for (int i=0;i<T;i++){
            int []countArr=new int[T];
            countArr[i]=0;
            test=sc.nextInt();
            String[]arr=new String[test];
            
            sc.nextLine();
            for (int j=0;j<test;j++){
                arr[j]=sc.nextLine();
            }
            for (int k=0;k<arr.length-1;k++){
                boolean repeat=false;
                for (int l=k+1;l<arr.length;l++){
                    if (arr[k].equals(arr[l])){
                        repeat=true;
                        countArr[i]++;
                        break;
                    }
                }
                
            }
            System.out.println(test-countArr[i]);
        }
        
    }
}
