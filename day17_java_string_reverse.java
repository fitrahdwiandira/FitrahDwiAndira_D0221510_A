import java.io.*;
import java.util.*;


public class day17_java_String_Reverse_palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean isPalindrome = true;
        for(int i=0;i<s.length();i++){
            if(!s.substring(i,i+1).equals(s.substring(s.length()-1-i,s.length()-i))){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
        
    }
    

