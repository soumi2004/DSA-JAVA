package Arrays;

import java.util.Scanner;

public class DifferenceMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array-Size
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        //Array-Input
        System.out.print("Enter the elemnt of array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // Find Max and Min
        int Max = arr[0];
        int Min = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(Max < arr[i]){
                Max = arr[i];
            }

            if(Min > arr[i]){
                Min = arr[i];
            }
        }

        int Difference = Max - Min;

        System.out.print("Maximum = " + Max);
        System.out.println();
        System.out.print("Minimum = " + Min);
        System.out.println();
        System.out.println("Difference = " + Max + " - " + Min + " = "  + Difference);


        sc.close();

    }
}
