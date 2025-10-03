package BasicMaths;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to count its digits: ");
        int num = sc.nextInt();
        while(num != 0){
            num = num/10;
            count++;
        }
        System.out.printf("The number of digits in the given number is/are: %d",count);
        sc.close();

    }
}
