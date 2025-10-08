package Recursion;

import java.util.Scanner;

public class ReverseAnArray {

    // ******************************************TWO-POINTER SWAP METHOD***********************************************
//     static void reverse( int[] arr, int start, int end){
//         if(start>=end){
//             return;
//         }
//         int temp = arr[start];
//         arr[start] = arr[end];
//         arr[end] = temp;
//         reverse(arr, start+1, end-1);
//     }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length of your array: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter " + n + " numbers: ");
//        for(int i = 0; i<n; i++){
//         arr[i] = sc.nextInt();
//        }
//
//        reverse(arr, 0, arr.length-1);
//        System.out.println("The reversed array is: " );
//        for(int num: arr){
//            System.out.println( num + " ");
//        }
//
//    }



    // *************************************ONE-POINTER SWAP METHOD*****************************************************
    static void reverse( int[] arr, int i){
        int n = arr.length;
        if(i>=n/2){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        reverse(arr, i+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of your array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        reverse(arr, 0);
        System.out.println("The reversed array is: " );
        for(int num: arr){
            System.out.println( num + " ");
        }

    }
}
