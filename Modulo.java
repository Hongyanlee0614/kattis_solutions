package kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class Modulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int[] arr = new int[10];
        int[] newArr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < 10; j++) {
            newArr[j] = arr[j] % 42;
        }
        ArrayList<Integer> a = new ArrayList<>();
        for (int k = 0; k < 10; k++) {
            if (!a.contains(newArr[k])) {
                a.add(newArr[k]);
            }
        }
        System.out.println(a.size());
    }
}
