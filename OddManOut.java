package kattis;
import java.util.Arrays;
import java.util.Scanner;

public class OddManOut {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            
            int G=sc.nextInt();
            int[]arr=new int[G];
            for(int j=0;j<G;j++){
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            if(arr[0]!=arr[1]){
                System.out.println("Case #"+i+": "+arr[0]);
            }
            else if(arr[arr.length-1]!=arr[arr.length-2]){
                System.out.println("Case #"+i+": "+arr[arr.length-1]);
            }
            else{
                for(int k=1;k<arr.length-1;k++){
                    if(arr[k]!=arr[k-1]&&arr[k]!=arr[k+1]){
                        System.out.println("Case #"+i+": "+arr[k]);
                    }
                }
            }
        }
    }
}
