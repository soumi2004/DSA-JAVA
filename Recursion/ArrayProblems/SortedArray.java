package Recursion.ArrayProblems;

import java.util.Scanner;

public class SortedArray {
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

        System.out.println(sorted(arr, 0));


        sc.close();
    }

    static boolean sorted(int[] arr, int index){
        // base condition
        if(index == arr.length-1){
            return  true;
        }

        return arr[index] <= arr[index+1] && sorted(arr, index+1);
    }
}
