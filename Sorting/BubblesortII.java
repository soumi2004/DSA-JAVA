package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubblesortII {

        static void bubble(int[] arr){
            boolean swapped;
         // run the steps n-1 times
        for(int i = 0; i < arr.length; i++){
            swapped = false;
            // for each step, max item will come at the last respective index
            for(int j = 1; j < arr.length-i; j++){
                // swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]) {
                  // swap
                  int temp = arr[j];
                  arr[j] = arr[j-1];
                  arr[j-1] = temp;
                  swapped = true;
                }
            }
 
                // if you did not swap for a particular value of i , it means the array is sorted hence stop the programme
                if(!swapped){ // !false = true
                    break;
                }

        }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array-Size
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Array-Element
        System.out.println("Enter the element of array: ");
        for(int i = 0; i < arr.length; i++){
             arr[i] = sc.nextInt();
        }

        bubble(arr);
        System.out.print("Sorted array : " + Arrays.toString(arr));

         sc.close();
        
    }
}
