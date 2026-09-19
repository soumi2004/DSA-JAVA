package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int ans = fact(n);
       
         for (int i = n; i >= 1; i--) {
            System.out.print(i);

            if (i != 1) {
                System.out.print(" * ");
            }
        }

        System.out.print(" = " + ans);

        sc.close();

    }

    static int fact(int n){
        if(n <= 1){
            return 1;
        }
        return n*fact(n-1);
    }
}
