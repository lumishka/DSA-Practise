package Recursion;

import java.util.Scanner;

public class CheckPalindrome {

//    static Boolean palindrome( String word, int i){
//
//        int n = word.length();
//        if(i>=n/2){
//            return true;
//        }
//        if(word.charAt(i) != word.charAt(n-i-1)){
//            return false;
//        }
//        return palindrome(word, i+1);
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a word to check if its palindrome or not: ");
//        String word = sc.next();
//
//
//        System.out.println(palindrome(word, 0));
//
//
//    }

      static boolean palindrome(char[] arr, int i){
          int n = arr.length;
          if(i>=n/2){
              return true;
          }
          if(arr[i] != arr[n-i-1]){
              return false;
          }
          return palindrome(arr, i+1);
      }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to check if its palindrome or not: ");
        String word = sc.next();
        char[] letters = new char[word.length()];

        for(int i = 0; i<word.length(); i++){
            letters[i] = word.charAt(i);
        }
        if(palindrome(letters, 0)){
            System.out.println("It is a palindrome.");
        }
        else{
            System.out.println("It is not a palindrome.");
        }

    }
}
