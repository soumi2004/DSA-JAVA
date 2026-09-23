package Recursion.ArrayProblems;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListRecursion{

    
    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }

        return  arr[index] == target || find(arr, target, index+1);

    }

    static ArrayList<Integer> findAllIndex(
        int[] arr,
        int target,
        int index,
        ArrayList<Integer> list) {

    if (index == arr.length) {
        return list;
    }

    if (arr[index] == target) {
        list.add(index);
    }

    return findAllIndex(arr, target, index + 1, list);
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

        ArrayList<Integer> ans = findAllIndex(arr, key, 0, new ArrayList<>());
        System.out.println(ans);
        sc.close();
    }
}
