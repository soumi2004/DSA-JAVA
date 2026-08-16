package Arrays;

import java.util.Scanner;

public class CountOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // array-size
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // array-input
        System.out.print("Enter the element of array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        
         System.out.print("Enter the key want to count: ");
         int key = sc.nextInt();

        // assume count is 0 
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            // if(arr[i] == arr[0]){
            //     count++;
            // }
            if(arr[i] == key){
                 count++;
             }
        }

        // System.out.println(arr[0] + " Occurs time = " + count);

         System.out.print(key + " Occusrs time = " + count);

        sc.close();
    }
}
