package Sorting.sorting_1;

import java.util.Scanner;

public class Insertion_Sort {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<=n-1; i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }

        }
        System.out.println("The sorted array is: ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
