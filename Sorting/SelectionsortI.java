package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionsortI {

        static  void selection(int[] arr){
            for(int i = 0; i < arr.length; i++){
                // find the max item in the remaining array and swap with correct index
                int last = arr.length-i-1;
                int maxIndex = getMaxIndex(arr, 0,last);
                swap(arr,maxIndex,last);
            }
        }

        static void swap(int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }

        private static int getMaxIndex(int[] arr, int start, int end){
            int max = start;
            for(int i = start; i <= end; i++){
                if(arr[max] < arr[i]){
                    max = i;
                }
            }
            return max;
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

        selection(arr);
        System.out.print("Sorted array : " + Arrays.toString(arr));

         sc.close();
        
    }
        
    }

