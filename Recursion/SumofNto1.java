package Recursion;

import java.util.Scanner;

public class SumofNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int ans = sum(n);

        for (int i = n; i >= 1; i--) {
            System.out.print(i);

            if (i != 1) {
                System.out.print(" + ");
            }
        }

        System.out.print(" = " + ans);

        sc.close();
    }

    static int sum(int n){
        if(n <= 1){
            return 1;
        }
        return n + sum(n-1);
    }

}
