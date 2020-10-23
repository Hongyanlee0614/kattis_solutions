package kattis;

import java.util.Scanner;

public class BasicProgramming1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumAll = 0;
        int sumEven = 0;
        int numOfValue = sc.nextInt();
        int t = sc.nextInt();
        int[] A = new int[numOfValue];
        for (int i = 0; i < numOfValue; i++) {
            A[i] = sc.nextInt();
        }
        if (t == 1) {
            System.out.println(7);
        } else if (t == 2) {
            if (A[0] > A[1]) {
                System.out.println("Bigger");
            } else if (A[0] == A[1]) {
                System.out.println("Equal");
            } else {
                System.out.println("Smaller");
            }
        } else if (t == 3) {
            System.out.println(A[1]);
        } else if (t == 4) {
            for (int j = 0; j < A.length; j++) {
                sumAll += A[j];
            }
            System.out.println(sumAll);
        } else if (t == 5) {
            for (int j = 0; j < A.length; j++) {
                if (A[j] % 2 == 0) {
                    sumEven += A[j];
                }
            }
            System.out.println(sumEven);
        } else if (t == 6) {
            for (int j = 0; j < A.length; j++) {                          
                if (A[j] <= 25) {
                    A[j] = A[j] + 97;
                    char c = (char) (A[j]);
                    System.out.print(c);
                }
                else if (A[j]>25){
                    A[j]=A[j]%26;
                    A[j] = A[j] + 97;
                    char c= (char)(A[j]);
                    System.out.print(c);
                }
            }
        } else if (t == 7) {
            int i = 0;
            while (i < numOfValue) {
                i = 1;
                if (i == numOfValue) {
                    System.out.println("Out");
                    break;
                }
                if (i == numOfValue - 1) {
                    System.out.println("Done");
                    break;
                } else {
                    System.out.println("Cyclic");
                    break;
                }

            }

        }
    }
}
