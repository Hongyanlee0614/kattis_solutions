package kattis;
import java.util.Scanner;
public class AlmostPerfect {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()) {
            int num=sc.nextInt();
            check(num);
        }sc.close();
    }
    public static void check(int i){
        int sum = 0;
	double x = Math.sqrt(i);
	
	if ((int)x == x)
		sum += (int)x;
	
        for(int j=2;j<x;j++){
            if(i%j==0){
                sum+=j+(i/j);
            }
        }
        if(sum+1==i){
            System.out.println(i+" perfect");
            return;
        }
        
        else if(Math.abs(i-(sum+1))<=2){
            System.out.println(i+" almost perfect");
            return;
        }
        else{
            System.out.println(i+" not perfect");
            return;
        }
    }
}
