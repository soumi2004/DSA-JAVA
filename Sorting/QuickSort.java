package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

     static void sort(int[] nums, int low, int high){
        if(low >= high){
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e-s) / 2;
        int pivot = nums[m];

        while(s <= e){

           while (nums[s] < pivot) {
             s++;
             }

           while (nums[e] > pivot) {
             e--;
             }

            if(s <= e){
                 int temp = nums[s];
                 nums[s] = nums[e];
                 nums[e] = temp;
                 s++;
                 e--;
            }
        }

        // now my pivot is at correct index, please sort two halves now
        sort(nums, low, e);
        sort(nums, s, high);
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

        sort(arr,0,arr.length-1);
        System.out.println("Sorted array: " + Arrays.toString(arr));

    sc.close();
    }

}
