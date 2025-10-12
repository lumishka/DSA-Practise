package Sorting.sorting_1;

import java.util.Scanner;

public class Bubble_Sort {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit for your array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of your array: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = n-1; i>0; i--){
            int didSwap = 0;
            for(int j = 0; j<i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap++;
                }
            }
            if(didSwap == 0){
                break;
            }
            System.out.print("runs\n");  // directly proportional to index lowest element is at.
            // for example: if lowest element is at index 5 run will print 5 times if its at 3 it will
            // print 3 times.
        }
        System.out.println("The sorted array is: ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
