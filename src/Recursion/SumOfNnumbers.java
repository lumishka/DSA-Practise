package Recursion;

import java.util.Scanner;



// *********************************** PARAMETERISED VERSION ( USES BACKTRACKING ) *************************
//public class SumOfNnumbers {
//    static void printSum(int i, int sum){
//        if(i<1){
//            System.out.printf("Total sum is : %d", sum);
//            return;
//        }
//        printSum(i-1, sum+i);
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number to find the sum of that number of first numbers: ");
//        int n = sc.nextInt();
//        printSum(n, 0);
//    }
//}


// ***************************************** FUNCTIONAL VERSION *****************************************


public class SumOfNnumbers {
    static int printSum(int n){
        if(n == 0){
            return 0;
        }
        return n + printSum(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int res = printSum(n);
        System.out.printf("The sum of first %d numbers is %d", n, res);
    }
}