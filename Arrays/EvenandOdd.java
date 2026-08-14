package Arrays;

import java.util.Scanner;

public class EvenandOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array-Size
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        //Array-Input
        System.out.print("Enter the element of Array: ");
        for(int i = 0; i < arr.length; i++){
             arr[i] = sc.nextInt();
        }
        
        //Even-Count and Odd-Count
        int evenCount = 0;
        int oddCount = 0;

        //Count Even and Odd
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                evenCount++;
            }else{
                   oddCount++;
            }
        }

        System.out.print("Even Numbers = " + evenCount);
        System.out.println();
        System.out.print("Odd Numbers = " + oddCount);


        sc.close();

    }
}
