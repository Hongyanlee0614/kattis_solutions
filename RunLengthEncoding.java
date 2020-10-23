package kattis;

import java.util.Scanner;

public class RunLengthEncoding {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if (c == 'E') {
            String encode = sc.nextLine();
            int count=-1;
            for (int i = 1; i < encode.length(); i++) {
                
                count++;
                if (encode.charAt(i-1) != encode.charAt(i) && i!=1) {
                    System.out.print(encode.charAt(i-1) + "" + (count));
                    count=0;
                }
                if(i==encode.length()-1){
                    System.out.println(encode.charAt(i)+""+(count+1));
                }
                
            }
        } else if (c == 'D') {
            String decode = sc.nextLine();
            int num = 0;
            for (int i = 0; i < decode.length(); i++) {
                if (Character.isDigit(decode.charAt(i))) {
                    if (i != 0) {
                        while (num < Integer.parseInt(String.valueOf(decode.charAt(i)))) {
                            System.out.print(decode.charAt(i - 1));
                            num++;
                        }

                    }
                }
                num = 0;
            }
        }
    }
}
