package Arrays;

import java.util.Scanner;

public class MaxElement{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       // array size
        System.out.print("Enetr the size of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n] ;

        // array element
        System.out.print("Enter the array element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //max element
        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max= arr[i];
            }
        }

        System.out.print("Maximum Element is = " + max);

        sc.close();
    }

}
