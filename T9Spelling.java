package kattis;

import java.util.Scanner;

public class T9Spelling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            
            String str = sc.next();
            sc.nextLine();
            System.out.print("Case #" + (i + 1)+": ");
            for (int j = 0; j < str.length()-1; j++) {
                switch (str.charAt(j)) {
                    case 'a':
                        if ((str.charAt(j + 1) == 'b' || str.charAt(j + 1) == 'c')) {
                            System.out.print("2 ");
                            break;
                        } else {
                            System.out.print("2");
                            break;
                        }
                    case 'b':
                        if ((str.charAt(j + 1) == 'a' || str.charAt(j + 1) == 'c') && j != str.length() - 1) {
                            System.out.print("22 ");
                            break;
                        } else {
                            System.out.print("22");
                            break;
                        }
                    case 'c':
                        if ((str.charAt(j + 1) == 'a' || str.charAt(j + 1) == 'b') && j != str.length() - 1) {
                            System.out.print("222 ");
                            break;
                        } else {
                            System.out.print("222");
                            break;
                        }
                    case 'd':
                        if ((str.charAt(j + 1) == 'e' || str.charAt(j + 1) == 'f') && j != str.length() - 1) {
                            System.out.print("3 ");
                            break;
                        } else {
                            System.out.print("3");
                            break;
                        }
                    case 'e':
                        if ((str.charAt(j + 1) == 'd' || str.charAt(j + 1) == 'f') && j != str.length() - 1) {
                            System.out.print("33 ");
                            break;
                        } else {
                            System.out.print("33");
                            break;
                        }
                    case 'f':
                        if ((str.charAt(j + 1) == 'e' || str.charAt(j + 1) == 'd') && j != str.length() - 1) {
                            System.out.print("333 ");
                            break;
                        } else {
                            System.out.print("333");
                            break;
                        }
                    case 'g':
                        if ((str.charAt(j + 1) == 'h' || str.charAt(j + 1) == 'i') && j != str.length() - 1) {
                            System.out.print("4 ");
                            break;
                        } else {
                            System.out.print("4");
                            break;
                        }
                    case 'h':
                        if ((str.charAt(j + 1) == 'g' || str.charAt(j + 1) == 'i') && j != str.length() - 1) {
                            System.out.print("44 ");
                            break;
                        } else {
                            System.out.print("44");
                            break;
                        }
                    case 'i':
                        if ((str.charAt(j + 1) == 'h' || str.charAt(j + 1) == 'g') && j != str.length() - 1) {
                            System.out.print("444 ");
                            break;
                        } else {
                            System.out.print("444");
                            break;
                        }
                    case 'j':
                        if ((str.charAt(j + 1) == 'k' || str.charAt(j + 1) == 'l') && j != str.length() - 1) {
                            System.out.print("5 ");
                            break;
                        } else {
                            System.out.print("5");
                            break;
                        }
                    case 'l':
                        if ((str.charAt(j + 1) == 'j' || str.charAt(j + 1) == 'k') && j != str.length() - 1) {
                            System.out.print("555 ");
                            break;
                        } else {
                            System.out.print("555");
                            break;
                        }
                    case 'k':
                        if ((str.charAt(j + 1) == 'j' || str.charAt(j + 1) == 'l') && j != str.length() - 1) {
                            System.out.print("55 ");
                            break;
                        } else {
                            System.out.print("55");
                            break;
                        }
                    case 'm':
                        if ((str.charAt(j + 1) == 'n' || str.charAt(j + 1) == 'o') && j != str.length() - 1) {
                            System.out.print("6 ");
                            break;
                        } else {
                            System.out.print("6");
                            break;
                        }
                    case 'n':
                        if ((str.charAt(j + 1) == 'm' || str.charAt(j + 1) == 'o') && j != str.length() - 1) {
                            System.out.print("66 ");
                            break;
                        } else {
                            System.out.print("66");
                            break;
                        }
                    case 'o':
                        if ((str.charAt(j + 1) == 'm' || str.charAt(j + 1) == 'n') && j != str.length() - 1) {
                            System.out.print("666 ");
                            break;
                        } else {
                            System.out.print("666");
                            break;
                        }
                    case 'p':
                        if ((str.charAt(j + 1) == 'q' || str.charAt(j + 1) == 'r' || str.charAt(j + 1) == 's') && j != str.length() - 1) {
                            System.out.print("7 ");
                            break;
                        } else {
                            System.out.print("7");
                            break;
                        }
                    case 'q':
                        if ((str.charAt(j + 1) == 'p' || str.charAt(j + 1) == 'r' || str.charAt(j + 1) == 's') && j != str.length() - 1) {
                            System.out.print("77 ");
                            break;
                        } else {
                            System.out.print("77");
                            break;
                        }
                    case 'r':
                        if ((str.charAt(j + 1) == 'q' || str.charAt(j + 1) == 'p' || str.charAt(j + 1) == 's') && j != str.length() - 1) {
                            System.out.print("777 ");
                            break;
                        } else {
                            System.out.print("777");
                            break;
                        }
                    case 's':
                        if ((str.charAt(j + 1) == 'q' || str.charAt(j + 1) == 'r' || str.charAt(j + 1) == 'p') && j != str.length() - 1) {
                            System.out.print("7777 ");
                            break;
                        } else {
                            System.out.print("7777");
                            break;
                        }
                    case 'w':
                        if ((str.charAt(j + 1) == 'x' || str.charAt(j + 1) == 'y' || str.charAt(j + 1) == 'z') && j != str.length() - 1) {
                            System.out.print("9 ");
                            break;
                        } else {
                            System.out.print("9");
                            break;
                        }
                    case 'x':
                        if ((str.charAt(j + 1) == 'w' || str.charAt(j + 1) == 'y' || str.charAt(j + 1) == 'z') && j != str.length() - 1) {
                            System.out.print("99 ");
                            break;
                        } else {
                            System.out.print("99");
                            break;
                        }
                    case 'y':
                        if ((str.charAt(j + 1) == 'x' || str.charAt(j + 1) == 'w' || str.charAt(j + 1) == 'z') && j != str.length() - 1) {
                            System.out.print("999 ");
                            break;
                        } else {
                            System.out.print("999");
                            break;
                        }
                    case 'z':
                        if ((str.charAt(j + 1) == 'x' || str.charAt(j + 1) == 'y' || str.charAt(j + 1) == 'w') && j != str.length() - 1) {
                            System.out.print("9999 ");
                            break;
                        } else {
                            System.out.print("9999");
                            break;
                        }
                    case 't':
                        if ((str.charAt(j + 1) == 'u' || str.charAt(j + 1) == 'v') && j != str.length() - 1) {
                            System.out.print("8 ");
                            break;
                        } else {
                            System.out.print("8");
                            break;
                        }
                    case 'u':
                        if ((str.charAt(j + 1) == 't' || str.charAt(j + 1) == 'v') && j != str.length() - 1) {
                            System.out.print("88 ");
                            break;
                        } else {
                            System.out.print("88");
                            break;
                        }
                    case 'v':
                        if ((str.charAt(j + 1) == 't' || str.charAt(j + 1) == 'u') && j != str.length() - 1) {
                            System.out.print("888 ");
                            break;
                        } else {
                            System.out.print("888");
                            break;
                        }
                    case ' ':
                        System.out.print("0");
                        break;
                }

            }
        }
    }
}
