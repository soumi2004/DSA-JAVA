package Arrays;

import java.util.Scanner;

public class TwoPointers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array-Size
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        //Array-Input
        System.out.print("Enter the elements of Array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // Reverse-Array
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        // Print Reverse-Array
        System.out.println("Reversed Array  = ");

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();


    }
}
