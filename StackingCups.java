package kattis;

import java.util.Scanner;

public class StackingCups {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] diameter = new int[num];
        String[] color = new String[num];
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            String s = sc.nextLine();
            String[] split = s.split(" ");

            if (Character.isDigit(split[0].charAt(0)) && !Character.isDigit(split[1].charAt(0))) {
                diameter[i] = Integer.parseInt(split[0])/2;
                color[i] = split[1];
            } else if (Character.isDigit(split[1].charAt(0)) && !Character.isDigit(split[0].charAt(0))) {
                diameter[i] = Integer.parseInt(split[1]);
                color[i] = split[0];
            }

        }
        for (int k = 0; k < diameter.length ; k++) {
            for (int l = 0; l < diameter.length-1; l++) {
                
                if (diameter[l] >= diameter[l+1]) {
                    int temp1=diameter[l];
                    diameter[l]=diameter[l+1];
                    diameter[l+1]=temp1;
                    
                    String temp = color[l];
                    color[l] = color[l+1];
                    color[l+1] = temp;
                }
            }
            
        }
        for(String s:color){
            System.out.println(s);
        }
    }
}
