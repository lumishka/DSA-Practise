package Recursion;

import java.util.Scanner;

public class CheckPalindrome {

    static Boolean palindrome( String word, int i){

        int n = word.length();
        if(i>=n/2){
            return true;
        }
        if(word.charAt(i) != word.charAt(n-i-1)){
            return false;
        }
        return palindrome(word, i+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to check if its palindrome or not: ");
        String word = sc.next();


        System.out.println(palindrome(word, 0));


    }
}
