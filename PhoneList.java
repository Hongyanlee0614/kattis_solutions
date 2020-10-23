package kattis;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class PhoneList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            boolean inconsistent = false;
            int phones = sc.nextInt();
            String[] phone = new String[phones];
            for (int j = 0; j < phone.length; j++) {
                phone[j]=sc.next();
            }
            Arrays.sort(phone);
            for (int j = 1; j < phone.length; j++) {
                if (phone[j].startsWith(phone[j-1]) ) {
                    inconsistent = true;
                    break;
                }

            }
            if (!inconsistent) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
