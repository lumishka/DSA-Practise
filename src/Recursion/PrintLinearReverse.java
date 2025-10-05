package Recursion;

import java.util.Scanner;

public class PrintLinearReverse {
    static void printReverse(int n){
     if(n<1){
         return;
     }
        System.out.println(n);
        printReverse(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        printReverse(n);
    }
}
