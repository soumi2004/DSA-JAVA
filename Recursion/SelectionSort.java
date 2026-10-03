package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

     
     static  void selection(int[] arr, int r, int c, int max){
        if(r == 0){
            return;
        }
        if(c < r) {
           if(arr[c] > arr[max]){
             selection(arr, r, c+1, c);
           }  else{
            selection(arr, r, c+1, max);
           }   
    } else
        {
       int temp = arr[max];
       arr[max] = arr[r-1];
       arr[r-1] = temp;
        selection(arr, r-1, 0, 0);
    }
}

    public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);

    // Array-Size
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Array-Element
        System.out.print("Enter the element of array: ");
        for(int i = 0; i < arr.length; i++){
             arr[i] = sc.nextInt();
        }

      // Call selection sort
        selection(arr, arr.length, 0, 0);

        // Print sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));

        sc.close();

      }

    }

