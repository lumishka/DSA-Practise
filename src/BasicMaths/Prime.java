package BasicMaths;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if its prime or not: ");
        int num = sc.nextInt();

        for(int i = 1; i*i<=num; i++){
            if(num%i == 0){
                count++;
                if((num/i) != i){
                    count++;
                }
            }
        }
        if(count==2){
            System.out.println("The number is a prime number.");
        }
        else{
            System.out.println("The number is not a prime number.");
        }
    }
}
