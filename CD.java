package kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class CD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jack = sc.nextInt();
        int jill = sc.nextInt();
        while (true) {
            if (jack == 0 && jill == 0) {
                break;
            }
            int count = 0;
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < jack+jill; i++) {
                int j = sc.nextInt();
                if (a.contains(j)) {
                    count++;
                }else if(a.size()<jack){
                    a.add(j);
                }
            }
            System.out.println(count);
            jack = sc.nextInt();
            jill = sc.nextInt();
        }
    }
}
