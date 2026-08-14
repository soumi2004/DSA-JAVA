package Arrays;

import java.util.Scanner;

public class SumofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array size
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        //array element
        System.out.print("Enter the element of an Array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // sum of array
        int sum  = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        System.out.print("Sum of the Array Elements = " + sum);

        sc.close();


    }
}
