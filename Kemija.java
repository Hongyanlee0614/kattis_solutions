package kattis;

import java.util.Scanner;

public class Kemija {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans="";
        /*Encode:
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                ans=ans+c+'p'+c;
            }
            else{
                ans+=c;
            }
        }
        System.out.println(ans);
        */  
        //Decode
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(s.length()==2){
                System.out.println(s.charAt(0)+""+s.charAt(1));
                break;
            }
            else if(s.length()==1){
                System.out.println(s.charAt(0)+"");
                break;
            }
            else if((c=='a'&&s.charAt(i+1)=='p'&&s.charAt(i+2)=='a')||(c=='e'&&s.charAt(i+1)=='p'&&s.charAt(i+2)=='e')||(c=='i'&&s.charAt(i+1)=='p'&&s.charAt(i+2)=='i')||(c=='o'&&s.charAt(i+1)=='p'&&s.charAt(i+2)=='o')||(c=='u'&&s.charAt(i+1)=='p'&&s.charAt(i+2)=='u')){
                ans=ans+c;
                i+=2;
            }
            
            else{
                ans+=c;
            }
        }
        System.out.println(ans);
    }
}
