package kattis;

import java.util.Scanner;

public class HelpTheProfessorOut {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            if (line.equals("P=NP")) {
                System.out.println("skipped");
            } else {
                for(int j=0;j<line.length();j++){
                    char c='+';
                    if(line.charAt(j)==c && j!=0){
                        System.out.println(Integer.parseInt(line.substring(0, j))+Integer.parseInt(line.substring(j+1, line.length())));
                    }
                }
            }
        }

    }
}
