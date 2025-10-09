package Recursion;

import java.util.Scanner;

public class Fibonnaci {
    static int findFibonacci(int n){
        if(n<=1){
            return n;
        }
        int last = findFibonacci(n-1);
        int slast = findFibonacci(n-2);

        return last+slast;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number upto which you wanna find fibonacci: ");
        int n = sc.nextInt();
        System.out.printf("Fibonacci for %d is: ", n);
        System.out.println(findFibonacci(n));
    }
}
