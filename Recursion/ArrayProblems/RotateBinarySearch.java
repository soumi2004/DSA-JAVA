package Recursion.ArrayProblems;

import java.util.Scanner;

public class RotateBinarySearch {

    static int search(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }

        int m = s + (e-s) / 2;
        if(arr[m] == target){
            return m;
        }

        if(arr[s] <= arr[m]){
            if(target >= arr[s] && target <= arr[m]){
               return  search(arr, target, s, m-1);
            } else {
              return search(arr, target, m+1, e);
            }
        }

        if(target >= arr[m] && target <= arr[e]){
            return search(arr, target, m+1, e);
        }

        return search(arr, target, s, m-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();
        int result = search(arr, target, 0, n-1);

        if(result == -1){
            System.out.println("Target not found..");
        } else {
            System.out.print("Target found at index: " + result);
        }

        sc.close();
    }
    
}
