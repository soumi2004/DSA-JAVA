package Recursion.ArrayProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class RecursionArrayListII {

      static ArrayList<Integer> findAllIndex(
        int[] arr,
        int target,
        int index) {

            ArrayList<Integer> list = new ArrayList<>();
        

    if (index == arr.length) {
        return list;
    }

    // this will contain answer for that function call only

    if (arr[index] == target) {
        list.add(index);
    }

    ArrayList<Integer> ansFromBelowCalls =  findAllIndex(arr, target, index + 1);
    list.addAll(ansFromBelowCalls);

    return list;
}

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

        // take target element

        System.out.print("Enter the target element : ");
        int target = sc.nextInt();

        ArrayList<Integer> result = findAllIndex(arr, target, 0);
       System.out.println("Indexes where " + target + " is found: " + result);
        sc.close();
    }
}
