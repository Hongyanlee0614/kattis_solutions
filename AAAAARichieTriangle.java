package kattis;
import java.util.Scanner;

public class AAAAARichieTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String readString = sc.nextLine();
        while (readString != null) {
            System.out.println(readString);

            if (readString.isEmpty()) {
                break;
            }

            if (sc.hasNextLine()) {
                readString = sc.nextLine();
            } else {
                readString = null;
            }
        }

    }
}
