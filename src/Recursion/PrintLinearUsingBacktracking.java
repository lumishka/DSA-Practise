package Recursion;

import java.util.Scanner;

public class PrintLinearUsingBacktracking {
    static void printBacktrack(int i){
        if(i<1){
            return;
        }
        printBacktrack(i-1);
        System.out.println(i);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        printBacktrack(n);
    }
}
