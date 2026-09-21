package Recursion;

import java.util.Scanner;

public class ReverseNumberI {

    static  int  rev1(int n){
        // sometimes you might need some addditional variables in the argument in that case , make another function
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n,digits);
    }

    private static int helper (int n, int digits){
        if(n%10 == n){
            return n;
        }

        int rem = n%10;
        return  rem * (int)(Math.pow(10,digits-1)) + helper(n/10, digits-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int ans = rev1(n);

        System.out.println("Reverse = " + ans);

        sc.close();
    }
}
