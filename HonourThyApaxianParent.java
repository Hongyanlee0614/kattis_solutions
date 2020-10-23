package kattis;

import java.util.Scanner;

public class HonourThyApaxianParent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Y=sc.nextLine();
        String[]split=Y.split(" ");
        String P=split[1];
        String y=split[0];
        if(y.substring(y.length()-1, y.length()).equals("e")){
            System.out.println(y+"x"+P);
        }
        else if(y.substring(y.length()-1, y.length()).equals("a")||y.substring(y.length()-1, y.length()).equals("i")||y.substring(y.length()-1, y.length()).equals("o")||y.substring(y.length()-1, y.length()).equals("u")){
            System.out.println(y.substring(0, y.length()-1)+"ex"+P);
        }
        else if(y.substring(y.length()-2, y.length()).equals("ex")){
            System.out.println(y+P);
        }
        else{
            System.out.println(y+"ex"+P);
        }
    }
}
