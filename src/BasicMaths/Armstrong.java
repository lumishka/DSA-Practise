package BasicMaths;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        int add = 0;
        int store;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check its armstrong: ");
        int num = sc.nextInt();
        int same = num;
        while(num !=0){
            store = num%10;
            num = num/10;
            add = add + (store*store*store);
        }

        if(same==add) {
            System.out.println("The number is an armstrong number");
        }
        else{
            System.out.println("The number is not an armstrong number");
        }
    }
}
