package BasicMaths;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args){
        int add = 0;
        int store;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse it: ");
        int num = sc.nextInt();
        while(num !=0){
            store = num%10;
            num = num/10;
            add = (add*10) + store;
        }
        System.out.printf("The reversed number is: %d",add);
    }
}
