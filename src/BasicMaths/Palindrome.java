package BasicMaths;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        int add = 0;
        int store;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check its palindrome: ");
        int num = sc.nextInt();
        int same = num;
        while(num !=0){
            store = num%10;
            num = num/10;
            add = (add*10) + store;
        }
        if(add==same){
            System.out.println("The number is a palindrome");
        }
        else{
            System.out.println("The number is not a palindrome");
        }

    }
}
