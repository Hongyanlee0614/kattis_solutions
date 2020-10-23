package kattis;

import java.util.Scanner;

public class ArmyStrengthEasy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfTestCase = sc.nextInt();
        System.out.println("");
        int numOfGods = 0;
        int numOfMecha = 0;
        for (int i = 0; i < numOfTestCase; i++) {
            numOfGods = sc.nextInt();
            numOfMecha = sc.nextInt();
            int[] god = new int[numOfGods];
            int[] mec = new int[numOfMecha];
            for (int j = 0; j < numOfGods; j++) {
                god[j] = sc.nextInt();
            }

            for (int j = 0; j < numOfMecha; j++) {
                mec[j] = sc.nextInt();
            }
            System.out.println("");
        }
        for (int k = 0; k < numOfGods; k++) {
            boolean larger=true;
            if ()
        }
    }

}
