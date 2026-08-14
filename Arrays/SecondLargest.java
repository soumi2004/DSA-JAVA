package Arrays;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Array- Size
        System.out.print("Enter the size of an Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        //Array-Input
        System.out.print("Enter the element of array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // Find Second-Largest

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE; // Integer.MIN_VALUE- the smallest possible int value in Java

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] > secondLargest && arr[i] != largest){
                  secondLargest = arr[i];
            }
        }

        System.out.print("Second Largest Number is = " + secondLargest);

        sc.close();

    }
}
