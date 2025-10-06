package Recursion;

import java.util.Scanner;

public class factorial {
    static int printProduct(int n){
        if(n == 0){
            return 1;
        }
        return n * printProduct(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int res = printProduct(n);
        System.out.printf("The factorial of first %d numbers is %d", n, res);
    }
}
