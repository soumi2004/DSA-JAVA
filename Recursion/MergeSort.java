package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        arr = mergeSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));

        sc.close();
    }

    static int[] mergeSort(int[] arr) {

        // Base case
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(
            Arrays.copyOfRange(arr, 0, mid)
        );

        int[] right = mergeSort(
            Arrays.copyOfRange(arr, mid, arr.length)
        );

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {

        int[] mix = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        // Compare both arrays
        while (i < left.length && j < right.length) {

            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }

            k++;
        }

        // Remaining elements of left
        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }

        // Remaining elements of right
        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }

        return mix;
    }
}
