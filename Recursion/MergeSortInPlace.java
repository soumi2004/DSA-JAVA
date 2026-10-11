package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortInPlace {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSortInPlace(arr, 0, arr.length);

        System.out.println("Sorted array: " + Arrays.toString(arr));

        sc.close();
        
    }

       static void  mergeSortInPlace(int[] arr, int s, int e) {

        // Base case
        if (e-s == 1) {
            return ;
        }

        int mid = (s + e) / 2;

        mergeSortInPlace(arr, s, mid);

         mergeSortInPlace(arr, mid, e);

          mergeInPlace(arr,s,mid,e);
        
    }

    private static void  mergeInPlace(int[] arr, int s, int m, int e) {

        int[] mix = new int[e-s];
        int i = s;
        int j = m;
        int k = 0;

        // Compare both arrays
        while (i < m && j < e) {

            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }

            k++;
        }

        // Remaining elements of left
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        // Remaining elements of right
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

       for(int l = 0; l < mix.length; l++ ){
        arr[s+l] = mix[l];
       }
    }
}
