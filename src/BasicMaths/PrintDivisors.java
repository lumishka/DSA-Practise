package BasicMaths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrintDivisors {
    // GREATER TIME COMPLEXITY METHOD


//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number to print all its divisors: ");
//        int num = sc.nextInt();
//        System.out.printf("All the divisors of %d are as follows: \n", num);
//        for(int i = 1; i<=num; i++){
//            if(num%i==0){
//                System.out.println(i);
//            }
//        }
//    }


    // LESSER TIME COMPLEXITY METHOD

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print all its divisors: ");
        int num = sc.nextInt();
        System.out.printf("All the divisors of %d are as follows: \n", num);
        List<Integer> divisors = new ArrayList<>();
        for(int i = 1; i*i<=num; i++){
            if(num%i==0){
                divisors.add(i);
                if((num/i) != 1){
                    divisors.add(num/i);
                }
            }
        }
        Collections.sort(divisors);
        System.out.println(divisors);
    }
}
