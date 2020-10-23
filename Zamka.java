package kattis;

import java.util.Scanner;

public class Zamka {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int D = sc.nextInt();
        int X = sc.nextInt();
        for (int i = L; i <= D; i++) {
            String a=Integer.toString(i);
            if (i / 10 == 0) {
                if (Character.getNumericValue(a.charAt(0))== X) {
                    System.out.println(a);
                    break;
                }
            }
            else if (i / 100 == 0) {
                if (Character.getNumericValue(a.charAt(0)) + Character.getNumericValue(a.charAt(1))== X) {
                    System.out.println(a);
                    break;
                }
            }
            else if (i / 1000 == 0) {
                if (Character.getNumericValue(a.charAt(0)) + Character.getNumericValue(a.charAt(1)) + Character.getNumericValue(a.charAt(2)) == X) {
                    System.out.println(a);
                    break;
                }
            }
            else if (i / 10000 == 0) {
                if (Character.getNumericValue(a.charAt(0)) + Character.getNumericValue(a.charAt(1)) + Character.getNumericValue(a.charAt(2)) + Character.getNumericValue(a.charAt(3))== X) {
                    System.out.println(a);
                    break;
                }
            }
        }
        for (int i = D; i >= L; i--) {
            String a = String.valueOf(i);
            if (i / 10 == 0) {
                if (Character.getNumericValue(a.charAt(0))== X) {
                    System.out.println(a);
                    break;
                }
            }
            else if (i / 100 == 0) {
                if (Character.getNumericValue(a.charAt(0)) + Character.getNumericValue(a.charAt(1))== X) {
                    System.out.println(a);
                    break;
                }
            }
            else if (i / 1000 == 0) {
                if (Character.getNumericValue(a.charAt(0)) + Character.getNumericValue(a.charAt(1)) + Character.getNumericValue(a.charAt(2)) == X) {
                    System.out.println(a);
                    break;
                }
            }
            else if (i / 10000 == 0) {
                if (Character.getNumericValue(a.charAt(0)) + Character.getNumericValue(a.charAt(1)) + Character.getNumericValue(a.charAt(2)) + Character.getNumericValue(a.charAt(3))== X) {
                    System.out.println(a);
                    break;
                }
            }
             else if (i / 10000 == 1) {
                if (Character.getNumericValue(a.charAt(0)) + Character.getNumericValue(a.charAt(1)) + Character.getNumericValue(a.charAt(2)) + Character.getNumericValue(a.charAt(3))== X) {
                    System.out.println(10000);
                    break;
                }
            }
        }
    }

}
