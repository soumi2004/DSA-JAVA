package Arrays;

import java.util.Scanner;

public class CheckSorted {
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

        // assume array sorted
        boolean isSorted = true;

        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }

        if(isSorted){
            System.out.println("Array is Sored. ");
        } else {
            System.out.println("Array is not Sorted. ");
        }

        sc.close();

    }
}
