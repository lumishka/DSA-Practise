package Sorting.sorting_1;

import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit for your array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter each element of the array: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<=n-2; i++){
            int mini = i;
          for(int j = i; j<=n-1; j++){
              if(arr[j] < arr[mini]){
                  mini = j;
              }
          }
          int temp = arr[i];
          arr[i] = arr[mini];
          arr[mini] = temp;
        }
        System.out.println("The sorted array is: ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
