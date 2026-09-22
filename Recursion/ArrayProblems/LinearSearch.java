package Recursion.ArrayProblems;

import java.util.Scanner;

public class LinearSearch {

    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }

        return  arr[index] == target || find(arr, target, index+1);

    }

    static  int findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return  index;
        } 
        else{
            return  findIndex(arr, target, index+1);
        }

    }

    static  int findIndexLast(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }

        if(arr[index] == target){
            return  index;
        } 
        else{
            return  findIndexLast(arr, target, index-1);
        }

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

        // element to search
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        System.out.println(find(arr, key, 0));
        System.out.println(findIndex(arr, key, 0));
        System.out.println(findIndexLast(arr, key, n-1));


        sc.close();

    }
}
