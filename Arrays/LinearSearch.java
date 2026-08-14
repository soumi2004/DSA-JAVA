package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array size
        System.out.print("Enter th size of array: ");
        int n = sc.nextInt();
        int[] arr = new int [n];

        // array input
        System.out.print("Enter the element of array: ");
        for(int i = 0; i < arr.length; i++){
             arr[i] = sc.nextInt();
        }

        // element to search
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        //Linear Search
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                System.out.println("Element found at index = " + i);
                break;
            }
        }

        sc.close();

    }
}
